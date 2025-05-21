package com.kdspring.learn_spring_framwork.examples.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
// 의존성 주입 알아보기

class YourBusinessClass{

    // field 인젝션
//    @Autowired
//    Dependency1 dependency1;
//
//    @Autowired
//    Dependency2 dependency2;

    Dependency1 dependency1;

    Dependency2 dependency2;

    // setter 인젝션
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter Injection - setDependency1");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter Injection - setDependency2");
//        this.dependency2 = dependency2;
//    }

    // Constructor Injection
    // 이 주입 방식은 AutoWired 가 궂이 필요하지 않다.

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection - YourBusinessClss");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " +  dependency1 + " and " + dependency2;
    }
}

class Dependency1 {}

class Dependency2 {}


/**
 * @ComponentScan을 별도의 basePackages 없이 선언하면,
 * 그 어노테이션이 붙은 클래스가 속한 패키지를 기준으로 하위 패키지를 전부 스캔한다.
 *
 */
@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {


    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext
                (RealWorldSpringContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(
                    context.getBean(BusinessCalucationService.class).findMax()
            );
        }


    }
}
