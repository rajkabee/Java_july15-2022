package com.example.annotationConfigWithoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      User user = (User)context.getBean("user2");
      System.out.println(user);
    }
}
