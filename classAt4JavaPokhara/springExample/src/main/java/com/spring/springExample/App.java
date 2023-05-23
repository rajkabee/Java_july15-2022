package com.spring.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
    	//Product product = new Product();
    	Product shirt = (Product)context.getBean("shirt");
    	System.out.println(shirt);
    	Product shoes = (Product)context.getBean("shoes");
    	Product sneakers = (Product)context.getBean("shoes");
    	shoes.setName("Pure Leather Red Boot");
    	sneakers.setName("Nike Running Sneakers");
    	System.out.println(shoes);
    	System.out.println(sneakers);
//        ((ConfigurableApplicationContext)context).close();
    	((AbstractApplicationContext)context).registerShutdownHook();
        System.out.println( "Hello World!" );
    }
}
