package com.example.coreJava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
//@Data
public class Person {
	private int id;
	private String name;
	private String address;
	public void test() throws Exception {
		super.clone();
	}
}
