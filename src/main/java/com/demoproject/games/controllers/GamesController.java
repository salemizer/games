package com.demoproject.games.controllers;

import com.demoproject.games.models.Game;
import com.demoproject.games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author  Ahmed Salem
 */

@RestController
@RequestMapping("/games")
public class GamesController {

    @Autowired
    GameService gameService;

    @GetMapping
    @RequestMapping("{game_id}")
    public Game getGame(@PathVariable Long game_id){
        return gameService.getGame(game_id);
    }

    @GetMapping
    public List<Game> listGames(){
        return gameService.listGames();
    }

}
