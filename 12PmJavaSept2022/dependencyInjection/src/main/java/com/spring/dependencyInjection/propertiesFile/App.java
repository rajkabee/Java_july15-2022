package com.spring.dependencyInjection.propertiesFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
        		"com/spring/dependencyInjection/propertiesFile/beans.xml"
        		); 
    	User user = (User)context.getBean("sarada");
    	
    	System.out.println(user);
    	User admin = (User)context.getBean("admin");
    	System.out.println(admin);
    }
    
}
