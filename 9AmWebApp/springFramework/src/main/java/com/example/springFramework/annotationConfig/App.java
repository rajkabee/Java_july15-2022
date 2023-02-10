package com.example.springFramework.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Product product = context.getBean("pd", Product.class);
    	System.out.println(product);
    	Product p = context.getBean("frame", Product.class);
    	System.out.println(p);
    	
    }
    
    
}
