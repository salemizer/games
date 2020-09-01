package com.demoproject.games.models;

import java.util.List;

/**
 * @author  Ahmed Salem
 */

public class Report {

    String user_with_most_comments;
    String highest_rated_game;
    List average_likes_per_game;


    public String getUser_with_most_comments() {
        return user_with_most_comments;
    }

    public void setUser_with_most_comments(String user_with_most_comments) {
        this.user_with_most_comments = user_with_most_comments;
    }

    public List getAverage_likes_per_game() {
        return average_likes_per_game;
    }

    public void setAverage_likes_per_game(List average_likes_per_game) {
        this.average_likes_per_game = average_likes_per_game;
    }

    public String getHighest_rated_game() {
        return highest_rated_game;
    }

    public void setHighest_rated_game(String highest_rated_game) {
        this.highest_rated_game = highest_rated_game;
    }
}
