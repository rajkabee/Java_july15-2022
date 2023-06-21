package com.rajkabee.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com/rajkabee/spring/annotations/context.xml");
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Dao dao = context.getBean("dao", Dao.class);
		System.out.println(dao);
		Dao dao2 = context.getBean("dataAccessObject", Dao.class);
		System.out.println(dao2);
		
		ProductDao pDao = context.getBean("productDao",ProductDao.class);
		System.out.println(pDao);
	}
}
