package com.rajkabee.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       //ApplicationContext context = new ClassPathXmlApplicationContext("com/rajkabee/spring/context/context.xml");
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/rajkabee/spring/context/context.xml");
       Dao dao1 = (Dao)context.getBean("dao");
       Dao dao2 = context.getBean("dao", Dao.class);
       //System.out.println(dao1);
       dao1.driver="com.mysql.cj.jdbc.driver";
       System.out.println(dao2.driver);
       context.close();
    }
}
