package com.project1.PracticeProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/project1/PracticeProject/Autoconfig.xml");

        Student s1 = context.getBean("Student1", Student.class);

        System.out.println(s1);
    }
}