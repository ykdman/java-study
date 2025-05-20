package com.kdspring.learn_spring_framwork.game;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game Run!!! :" + game);
        game.up();
        game.left();
        game.right();
        game.left();
    }
}
