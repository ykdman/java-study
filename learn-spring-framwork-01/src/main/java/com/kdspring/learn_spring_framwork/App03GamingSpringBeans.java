package com.kdspring.learn_spring_framwork;

import com.kdspring.learn_spring_framwork.game.GameRunner;
import com.kdspring.learn_spring_framwork.game.GamingConsole;
import com.kdspring.learn_spring_framwork.game.Pacman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext
                (GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }


    }
}
