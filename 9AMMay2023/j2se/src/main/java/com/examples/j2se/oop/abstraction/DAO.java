package com.examples.j2se.oop.abstraction;

public interface DAO {
	public void connect();
	public void disconnect();
	public void save();
	public void read();
	public void update();
	public void delete();
}
