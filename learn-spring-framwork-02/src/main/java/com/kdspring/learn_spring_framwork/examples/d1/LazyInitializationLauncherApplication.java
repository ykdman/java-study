package com.kdspring.learn_spring_framwork.examples.d1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some Initiaalization Logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Do Something!!!");
    }
}

/**
 * @ComponentScan을 별도의 basePackages 없이 선언하면,
 * 그 어노테이션이 붙은 클래스가 속한 패키지를 기준으로 하위 패키지를 전부 스캔한다.
 *
 */
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {


    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext
                (LazyInitializationLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println("Initialization of context is completed");
            context.getBean(ClassB.class).doSomething();
        }

    }
}
