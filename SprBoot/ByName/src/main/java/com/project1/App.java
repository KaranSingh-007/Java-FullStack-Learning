package com.project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        ApplicationContext context =
        	    new ClassPathXmlApplicationContext("com/project1/Autoconfig.xml");
        Emp e1 = context.getBean("emp1", Emp.class);

        System.out.println(e1);
    }
}