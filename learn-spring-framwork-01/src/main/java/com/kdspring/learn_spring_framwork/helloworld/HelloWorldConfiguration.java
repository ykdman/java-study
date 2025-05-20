package com.kdspring.learn_spring_framwork.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person (String name, int age, Address address) {}
record Address (String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Hello World";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, address());
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("mokdong", "SEOUL");
    }

    // @Bean 과 연관이 있는 객체 만들기
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    // 매개 변수가 있는 @Bean 만들기
    @Bean
    public Person person3Parameter(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }
}
