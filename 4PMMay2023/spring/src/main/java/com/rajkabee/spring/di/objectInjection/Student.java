package com.rajkabee.spring.di.objectInjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	int id;
	String name;
	String email;
	Laptop laptop;
}
