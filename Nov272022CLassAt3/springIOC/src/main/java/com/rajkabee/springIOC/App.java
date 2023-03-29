package com.rajkabee.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	Product p = (Product)context.getBean("pd");
    	System.out.println(p);
        System.out.println( "Hello World!" );
        
        Category cat = (Category) context.getBean("cat");

        System.out.println(cat);
    }
}
