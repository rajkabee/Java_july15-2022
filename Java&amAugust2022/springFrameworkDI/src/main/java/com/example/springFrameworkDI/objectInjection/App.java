package com.example.springFrameworkDI.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/example/springFrameworkDI/objectInjection/beans.xml");
    	//Course course = context.getBean(Course.class,"javaCourse");
    	Course javaCourse = (Course)context.getBean("javaCourse");
    	/*
    	javaCourse.id=123;
    	javaCourse.title="Advanced Java Course";
    	javaCourse.duration=120;
    	*/
    	System.out.println(javaCourse);
    	Course angularCourse = (Course)context.getBean("angularCourse");
    	System.out.println(angularCourse);
        System.out.println( "Hello World!" );
    }
}
