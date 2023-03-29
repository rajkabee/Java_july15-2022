package com.example.springFramework2;

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
    	Person subash = (Person)context.getBean("subash");
//    	subash.id=23213;
//    	subash.name="Subash";
//    	subash.email = "subash@gmail.com";
    	System.out.println(subash);
    	Person rahul = (Person)context.getBean("rahul");
    	System.out.println(rahul);
    }
}
