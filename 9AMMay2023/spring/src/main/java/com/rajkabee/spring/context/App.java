package com.rajkabee.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
    	DataAccessObject dao = ctx.getBean("dao",DataAccessObject.class);
    	dao.url="facebook.com";
    	DataAccessObject dao2 = ctx.getBean("dao",DataAccessObject.class);
    	dao2.url="Google.com";
    	System.out.println(dao.url);
    	System.out.println(dao2.url);
        System.out.println( "Hello World!" );
        ctx.close();
    }
}
