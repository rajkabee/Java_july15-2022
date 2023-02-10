package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TsetingWithJUnitAndMokitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsetingWithJUnitAndMokitoApplication.class, args);
		Calculator calc = new Calculator(new CalculatorService() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		});
		System.out.println(calc.add(34,56));
	}

}
