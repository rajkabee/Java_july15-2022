package com.example.springFramework.lifecycleHooks;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
//@Scope("singleton")
public class UserService {
	public List<String> users = Arrays.asList("Sangam", "Khagendra", "Sagar");
	public String getUser(int id) {
		return users.get(id-1);
	}
	@PostConstruct
	public void connectToDatabase() {
		System.out.println("Connected to the database!");
	}
	
	@PreDestroy
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}
}
