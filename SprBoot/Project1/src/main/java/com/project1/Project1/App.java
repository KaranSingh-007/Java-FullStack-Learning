package com.project1.Project1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(Autoconfig.class);
        User user = cont.getBean("User2",User.class);
        System.out.println(user);
    }
}
