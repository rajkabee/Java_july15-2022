package com.spring.springExample;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
    	//Product product = new Product();
    	//Product pd = context.getBean(Product.class);
    	Product shoes = (Product)context.getBean("shoes");
    	Product sneakers = (Product)context.getBean("shoes");
    	shoes.setName("Pure Leather Red Boot");
    	sneakers.setName("Nike Running Sneakers");
    	System.out.println(shoes);
    	System.out.println(sneakers);
        System.out.println( "Hello World!" );
    }
}
