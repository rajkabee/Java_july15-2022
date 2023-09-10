package com.sachistha.javaSE.inheritance;

import java.util.List;

public class PersonDAO implements DataAccessObject<Person, Integer>{

	@Override
	public int save(Person t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Person getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Person t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
