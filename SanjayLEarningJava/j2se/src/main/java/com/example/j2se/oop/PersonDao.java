package com.example.j2se.oop;

public class PersonDao extends DAO{
	@Override
	public void save() {
		System.out.println("Saved to db..");
	}
	@Override
	public void delete() {
		System.out.println("Deleted from DB...");	
	}
}
