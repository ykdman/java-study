package com.kdspring.learn_spring_framwork.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloworldSpring {
    public static void main(String[] args){
        // 1. Launch a Spring Context

        var context =
                new AnnotationConfigApplicationContext
                        ( HelloWorldConfiguration.class );

        // 2. Configure the things that we want Spring to manage  - @Configuration
        // HelloWorldConfiguration -> @Configuration
        // name - @Bean

        // 3. Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));

        // @Bean 객체를 통해 만든 @Bean 부르기
        System.out.println(context.getBean("person2MethodCall"));

        // 파라미터가 있는 @Bean 객체 사용
        System.out.println(context.getBean("person3Parameter"));

        System.out.println("-----------------------------------------------");
        // 모든 Bean 찾아오기
        String[] str = context.getBeanDefinitionNames();
        Arrays.stream(str).forEach(System.out::println);
//        context.getBeanDefinitionCount();

    }
}
