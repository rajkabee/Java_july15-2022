package com.examples.j2se.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class StudentDao extends AbstractDao<Student> {
	String query;
	PreparedStatement pstm;
	int i;
	
	@Override
	public int save(Student st) throws SQLException {
		connect();
		query = "insert into student (name, contact, active) values(?,?,?)";
		pstm = con.prepareStatement(query); 
		pstm.setString(1, st.getName());
		pstm.setLong(2, st.getContact());
		pstm.setBoolean(3, st.isActive());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Student getOne(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Student t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
