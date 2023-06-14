package com.rajkabee.springFrameworkExample.literalInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student st = context.getBean("st", Student.class);
        System.out.println(st);
        Student std = (Student)context.getBean("std");
        System.out.println( std );
    }
}
