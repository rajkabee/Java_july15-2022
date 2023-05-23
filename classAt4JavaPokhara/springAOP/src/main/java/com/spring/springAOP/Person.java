package com.spring.springAOP;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component("person")
public class Person {
	int id;
	String name;
	String address;
	
	private void display() {
		System.out.println(id+". "+name+"\t"+address);
	}
	
}
