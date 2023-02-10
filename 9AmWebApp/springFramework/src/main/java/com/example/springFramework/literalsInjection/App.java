package com.example.springFramework.literalsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/example/springFramework/literalsInjection/beans.xml");
        
        Product ring = context.getBean("ring",Product.class);
        Product chain = context.getBean("chain",Product.class);
        
        System.out.println(ring);
        System.out.println(chain);
    }
    
    
}
