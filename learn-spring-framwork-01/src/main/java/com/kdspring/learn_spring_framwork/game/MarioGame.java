package com.kdspring.learn_spring_framwork.game;

public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("GO Into a Hole");
    }

    public void left() {
        System.out.println("GO Back");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
