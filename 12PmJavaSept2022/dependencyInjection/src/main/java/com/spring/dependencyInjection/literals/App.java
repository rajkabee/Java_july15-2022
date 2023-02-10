package com.spring.dependencyInjection.literals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dependencyInjection/literals/beans.xml"); 
    	User user = (User)context.getBean("smriti");
    	//user.name="Sarada";
    	System.out.println(user);
    	User rakshya = (User)context.getBean("rakshya");
    	//user.name="Sarada";
    	System.out.println(rakshya);
        
        System.out.println( "Hello World!" );
    }
}
