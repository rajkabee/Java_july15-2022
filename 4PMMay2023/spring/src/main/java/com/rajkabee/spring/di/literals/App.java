package com.rajkabee.spring.di.literals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajkabee/spring/di/literals/context.xml");
		Dao dao = context.getBean("dao", Dao.class);
		System.out.println(dao);
		Dao odao = context.getBean("odao", Dao.class);
		System.out.println(odao);
	}
}
