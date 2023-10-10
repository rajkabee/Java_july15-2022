package com.rajkabee.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        AccountType savings = context.getBean("savings", AccountType.class);
        AccountType fixed = context.getBean("fixed", AccountType.class);
		/*
		 * savings.id=123; savings.name="Savings"; savings.interest=5.33f;
		 */
        System.out.println(savings);
        System.out.println(fixed);
    	System.out.println( "Hello World!" );
    }
}
