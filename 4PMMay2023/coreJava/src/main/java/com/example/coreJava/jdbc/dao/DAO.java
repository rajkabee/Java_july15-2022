package com.example.coreJava.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
	public void connect() throws SQLException;
	public void disconnect() throws SQLException;
	public int save(T t) throws SQLException;
	public T getOne(int id) throws SQLException;
	public List<T> getAll() throws SQLException;
	public int update(T t) throws SQLException;
	public int delete(int id) throws SQLException;
}
