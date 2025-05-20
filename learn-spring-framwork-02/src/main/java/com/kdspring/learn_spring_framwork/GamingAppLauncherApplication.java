package com.kdspring.learn_spring_framwork;

import com.kdspring.learn_spring_framwork.game.GameRunner;
import com.kdspring.learn_spring_framwork.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kdspring.learn_spring_framwork.game")
public class GamingAppLauncherApplication {



    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        System.out.println("Parameter: " + game);
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }


    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext
                (GamingAppLauncherApplication.class)) {

            context.getBean(GameRunner.class).run();
        }


    }
}
