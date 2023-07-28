package com.example.demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SwingSpringApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SwingSpringApplication.class)
		//SpringApplication.run(SwingSpringApplication.class, args);
        .headless(false)
        .web(WebApplicationType.NONE)
        .run(args);
		Thread thread = new Thread(new SearchClientFrm());
		thread.start();
	}

}
