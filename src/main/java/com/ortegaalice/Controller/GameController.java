package com.ortegaalice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ortegaalice.gamestore.Model.Game;
import com.ortegaalice.gamestore.Repository.GameRepository;


@Controller
public class GameController {

    //conversar com o crud
    @Autowired
    GameRepository gameRepository;
    
    @GetMapping("/game-list")
    public ModelAndView gameList() {
        ModelAndView mv = new ModelAndView("game/list");
        mv.addObject("games", gameRepository.findAll());
        return mv; 
    }
    
    @PostMapping("game-add")
    public ModelAndView createGame(Game game) {
        ModelAndView mv = new ModelAndView("/game/add");
        gameRepository.save(game);
        mv.setViewName("redirect:/game-list");

        return mv;
    }



}
