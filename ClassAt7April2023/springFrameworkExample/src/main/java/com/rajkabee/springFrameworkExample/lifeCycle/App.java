package com.rajkabee.springFrameworkExample.lifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        Student st1 = context.getBean("std", Student.class);
        st1.setName("Sabindra Maharjan");
        System.out.println(st1);
        Student st2 = (Student)context.getBean("sts");
        System.out.println( st2 );
        context.close();
        
    }
}
