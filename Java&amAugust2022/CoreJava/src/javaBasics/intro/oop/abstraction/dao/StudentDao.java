package javaBasics.intro.oop.abstraction.dao;

import java.util.ArrayList;

public class StudentDao extends AbstractDao<Student> {

	@Override
	public int save(Student t) {
		connect();
		System.out.println("Student saved to the database!");
		disconnect();
		return 0;
	}

	@Override
	public Student getOne(int id) {
		connect();
		System.out.println("A student is fetched from the database!");
		disconnect();
		return new Student();
	}

	@Override
	public ArrayList<Student> getAll() {
		connect();
		System.out.println("all Students fetched from the database!");
		disconnect();
		return new ArrayList<Student>();
	}

	@Override
	public int update(Student t) {
		connect();
		System.out.println("Student updated in the database!");
		disconnect();
		return 1;
	}

	@Override
	public int delete(int id) {
		connect();
		System.out.println("Student dalated from the database!");
		disconnect();
		return 1;
	}

	

}
