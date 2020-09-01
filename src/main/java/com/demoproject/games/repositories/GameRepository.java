package com.demoproject.games.repositories;

import com.demoproject.games.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * @author  Ahmed Salem
 */

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(value = "select gameTitle from (select gameId, gameTitle, max(sumLikes) from (select g.game_id as gameId, g.title as gameTitle, sum(c.likes) as sumLikes from comments c, games g where g.game_id = c.game_id group by g.game_id) AS sum_likes) As maxLikes", nativeQuery = true)
    public String findHighestRatedGame();

    @Query("select g.title, avg(c.like) from games g, comments c where g.game_id = c.game group by(g.title)")
    public List findAvgLikesPerGame();

}
