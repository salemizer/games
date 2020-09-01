package com.demoproject.games.services;

import com.demoproject.games.models.Report;
import com.demoproject.games.repositories.GameRepository;
//import com.demoproject.games.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author  Ahmed Salem
 */

@Service
public class ReportService {

    @Autowired
    GameRepository gameRepository;

//    @Autowired
//    UserRepository userRepository;


    public Report generateReport(){

        Report report = new Report();

//        String userWithMostComments = userRepository.findUserWithMostComments();

//        report.setUser_with_most_comments(userWithMostComments);

        String game_title = findHighestRatedGame();

        report.setHighest_rated_game(game_title);

        List list =  findAvgLikesPerGame();

        report.setAverage_likes_per_game(list);

        return report;
    }

    public String findHighestRatedGame(){
        return gameRepository.findHighestRatedGame();
    }

    public List findAvgLikesPerGame(){
        return gameRepository.findAvgLikesPerGame();
    }

//    public String findUserWithMostComments(){
//        return userRepository.findUserWithMostComments();
//    }

}
