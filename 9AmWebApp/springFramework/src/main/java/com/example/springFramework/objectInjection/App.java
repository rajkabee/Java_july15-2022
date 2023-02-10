package com.example.springFramework.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/example/springFramework/objectInjection/beans.xml");
        
        Product ring = context.getBean("ring",Product.class);
        Product chain = context.getBean("chain",Product.class);
        Product ear_ring= context.getBean("ear_ring",Product.class);
        
        System.out.println(ring);
        System.out.println(chain);
        System.out.println(ear_ring);
    }
    
    
}
