package com.whq.usecase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"com.fc.async","com.whq.usecase"})
@EnableScheduling
public class UsecaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsecaseApplication.class, args);
    }

}
