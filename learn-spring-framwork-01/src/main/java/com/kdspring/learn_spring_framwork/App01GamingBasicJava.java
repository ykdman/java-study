package com.kdspring.learn_spring_framwork;

import com.kdspring.learn_spring_framwork.game.GameRunner;
import com.kdspring.learn_spring_framwork.game.Pacman;

public class App01GamingBasicJava {
    public static void main(String[] args){
//        var game = new MarioGame();
//        var game = new SuperContra();
        var game = new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
