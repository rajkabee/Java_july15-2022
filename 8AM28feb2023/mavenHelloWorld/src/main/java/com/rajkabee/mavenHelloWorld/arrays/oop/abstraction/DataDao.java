package com.rajkabee.mavenHelloWorld.arrays.oop.abstraction;

public class DataDao extends AbstractDao<Data> {

	@Override
	public void insert(Data t) {
		System.out.println("Data Saved to the database!");
	}

	@Override
	public Data getOne(int id) {
		System.out.println("Data fetched from the table!");
		return new Data(1, "Fetched Data");
	}

}
