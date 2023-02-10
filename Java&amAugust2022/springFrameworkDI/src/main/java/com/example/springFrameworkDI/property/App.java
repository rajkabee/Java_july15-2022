package com.example.springFrameworkDI.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new ClassPathXmlApplicationContext(
    			"com/example/springFrameworkDI/property/beans.xml"
    			);
    	
    	Course ccna = (Course)context.getBean("CCNA");
    	System.out.println(ccna);
        System.out.println( "Hello World!" );
    }
}
