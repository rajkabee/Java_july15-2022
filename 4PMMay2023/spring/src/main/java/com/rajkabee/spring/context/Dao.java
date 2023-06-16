package com.rajkabee.spring.context;

public class Dao {
	String driver;
	String url;
	String username;
	String password;
	//@PostConstruct
	public void postConstruct() {
		System.out.println("Dao object created!");
	}
	//@PreDestroy
	public void preDestroy() {
		System.out.println("Dao object destroyed!");
	}
}
