package com.kdspring.learn_spring_framwork.examples.p1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass (SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All Dependencies Are Ready!!!");
    }

    // 해당 어노테이션 사용시, DI 수행 후 바로 실행될 메서드에 연결해준다.
    // PostConstruct 메서드는 DI 수행 후 바로 실행 된다.
    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    /**
     * PreDestroy 는 객체 의존성이 해제될 떄 실행되는 메서드
     */
    @PreDestroy
    public void cleanup() {
        System.out.println("CleanUp Destroy!!!");
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Some Logic Using SomeDependency");
    }
}

/**
 * @ComponentScan을 별도의 basePackages 없이 선언하면,
 * 그 어노테이션이 붙은 클래스가 속한 패키지를 기준으로 하위 패키지를 전부 스캔한다.
 *
 */
@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {


    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext
                (PrePostAnnotationContextLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

        }

    }
}
