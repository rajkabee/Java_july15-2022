package coreJava.basics.OOP.concepts.abstraction;

import java.util.ArrayList;

public class StudentDao extends AbstractDao<Student> {

	@Override
	public int save(Student st) {
		System.out.println(st.name + "Saved to the database!");
		return 1;
	}

	@Override
	public Student getOne(int id) {
		Student st = new Student();
		st.name = "acsadas";
		return st;
	}

	@Override
	public ArrayList<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Student t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
