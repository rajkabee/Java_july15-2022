package com.example.springFramework.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       // ApplicationContext context = new ClassPathXmlApplicationContext("com/example/springFramework/di/beans.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        Contact pokhara = (Contact)context.getBean("pok");
        Contact kathmandu = (Contact)context.getBean("ktm");
        System.out.println(pokhara);
        System.out.println(kathmandu);
    	System.out.println( "Hello World!" );
    	System.out.println(context.getBean("retreat"));
    	System.out.println(context.getBean("chitwan"));
    }
}
