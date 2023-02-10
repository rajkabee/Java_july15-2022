package com.spring.dependencyInjection.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dependencyInjection/annotations/beans.xml"); 
    	User user = (User)context.getBean("sarada");
    	//user.setName("Sarada");
    	System.out.println(user);
    }
}
