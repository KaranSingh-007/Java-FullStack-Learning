package com.project1.Project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.project1.Project1")
public class Autoconfig {

    @Bean("User1")
    public User getUser1() {
        return new User(4, "Ashok");
    }

    @Bean("User2")
    public User getUser2() {
        return new User(5, "Alok");
    }
}