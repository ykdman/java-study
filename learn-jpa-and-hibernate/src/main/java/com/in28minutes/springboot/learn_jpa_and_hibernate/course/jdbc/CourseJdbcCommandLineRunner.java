package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String ...args) throws Exception {
        repository.insert(new Course(1, "JAVA Course", "kdman"));
        repository.insert(new Course(2, "JAVA Spring", "kdman"));
        repository.insert(new Course(3, "JAVA Spring Boot", "kdman"));
        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
