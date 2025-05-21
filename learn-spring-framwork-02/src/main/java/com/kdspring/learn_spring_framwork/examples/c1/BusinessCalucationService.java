package com.kdspring.learn_spring_framwork.examples.c1;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalucationService {
    private DataService dataService;

    public BusinessCalucationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData())
                .max().orElse(0);

    }
}
