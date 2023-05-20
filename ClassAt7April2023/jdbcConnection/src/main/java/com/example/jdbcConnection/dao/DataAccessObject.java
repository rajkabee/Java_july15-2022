package com.example.jdbcConnection.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DataAccessObject<T> {
	void connect() throws ClassNotFoundException, SQLException;
	void disconnect()throws ClassNotFoundException, SQLException;
	int save(T t)throws ClassNotFoundException, SQLException;
	T getOne(int id)throws ClassNotFoundException, SQLException;
	ArrayList<T> getAll()throws ClassNotFoundException, SQLException;
	int update(T t)throws ClassNotFoundException, SQLException;
	int delete(int id)throws ClassNotFoundException, SQLException;
}
