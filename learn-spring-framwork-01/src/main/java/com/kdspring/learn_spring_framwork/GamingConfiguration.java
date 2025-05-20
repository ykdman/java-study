package com.kdspring.learn_spring_framwork;

import com.kdspring.learn_spring_framwork.game.GameRunner;
import com.kdspring.learn_spring_framwork.game.GamingConsole;
import com.kdspring.learn_spring_framwork.game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game= new Pacman();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
