package com.demoproject.games.services;

import com.demoproject.games.Utils;
import com.demoproject.games.models.Comment;
import com.demoproject.games.models.Game;
import com.demoproject.games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author  Ahmed Salem
 */

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public Game getGame(Long game_id){
        Game game = gameRepository.getOne(game_id);
        List<Comment> comments= game.getComments();
        for(Comment c: comments){
           String readableDateCreated =  Utils.convertEpochToReadableStr(c.getDateCreated());
            c.setDateCreated(readableDateCreated);
        }

        return game;
    }

    public List<Game> listGames(){
        List<Game> games = gameRepository.findAll();

        for(Game g: games){

            List<Comment> comments =  g.getComments();

            for(Comment c: comments) {
                String readableDateCreated = Utils.convertEpochToReadableStr(c.getDateCreated());
                c.setDateCreated(readableDateCreated);
            }
        }

        return games;
    }

}
