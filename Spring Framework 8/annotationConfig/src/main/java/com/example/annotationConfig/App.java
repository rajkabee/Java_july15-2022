package com.example.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.annotationConfig.beans.User;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);
        System.out.println("Context workin fine!");
        User user2 = (User)context.getBean("user2");
        System.out.println(user2);
    }
}
