package com.example.springFrameworkDI.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {	
    	ConfigurableApplicationContext context = 
    			new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    	
    	Course ccna = (Course)context.getBean("course");
    	System.out.println(ccna);
    	System.out.println((Course)context.getBean("myCourse"));
    	
        System.out.println( "Hello World!" );
        context.close();
    }
}
