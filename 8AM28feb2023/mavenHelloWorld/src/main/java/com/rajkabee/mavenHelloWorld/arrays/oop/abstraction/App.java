package com.rajkabee.mavenHelloWorld.arrays.oop.abstraction;

public class App {
	public static void main(String[] args) {
		DataDao  dao = new DataDao();
		//AbstractDao aDao = new AbstractDao();
		dao.connect();
		dao.insert(new Data(2, "Hello"));
		Data data = dao.getOne(1);
		System.out.println(data);
		dao.disconnect();
	}
}
