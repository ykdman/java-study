package com.kdspring.learn_spring_framwork.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
    public void up() {
        System.out.println("move North");
    }

    public void down() {
        System.out.println("move South");
    }

    public void left () {
        System.out.println("move West");
    }

    public void right () {
        System.out.println("move East");
    }
}
