package com.rajkabee.spring.di.literals;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
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
