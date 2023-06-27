package com.rajkabee.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
    	Operation op = ctx.getBean("operation", Operation.class);
    	op.task1();
    	op.task1("Jack");
    	op.task2();
        
        System.out.println( "Hello World!" );
    }
}
