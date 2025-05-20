package com.kdspring.learn_spring_framwork.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("Sit Down");
    }

    public void left() {
        System.out.println("GO Back");
    }

    public void right() {
        System.out.println("Shoot Out Bullet");
    }

}
