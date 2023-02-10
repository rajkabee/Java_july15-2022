package coreJava.basics.jdbc.dao;

import java.util.ArrayList;

public interface DataAccessObject<T> {
	public void connect();
	public void disconnect();
	public int save(T t);
	public T getOne(int id);
	public ArrayList<T> getAll();
	public int update(T t);
	public int delete(int id);
}
