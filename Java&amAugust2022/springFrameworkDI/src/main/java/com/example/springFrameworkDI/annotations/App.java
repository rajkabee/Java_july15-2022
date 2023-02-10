package com.example.springFrameworkDI.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new ClassPathXmlApplicationContext(
    			"com/example/springFrameworkDI/annotations/beans.xml"
    			);
    	
    	Course ccna = context.getBean(Course.class);
    	System.out.println(ccna);
        System.out.println( "Hello World!" );
    }
}
