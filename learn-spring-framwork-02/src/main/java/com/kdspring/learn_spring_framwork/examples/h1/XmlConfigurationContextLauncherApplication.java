package com.kdspring.learn_spring_framwork.examples.h1;

import com.kdspring.learn_spring_framwork.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @ComponentScan을 별도의 basePackages 없이 선언하면,
 * 그 어노테이션이 붙은 클래스가 속한 패키지를 기준으로 하위 패키지를 전부 스캔한다.
 *
 */
public class XmlConfigurationContextLauncherApplication {


    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean("name")); // KDMAN이 출력됨
            System.out.println(context.getBean("age")); // 28 출력 됨

            context.getBean(GameRunner.class);
        }


    }
}
