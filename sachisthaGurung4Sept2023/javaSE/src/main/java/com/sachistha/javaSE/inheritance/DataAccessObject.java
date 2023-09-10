package com.sachistha.javaSE.inheritance;

import java.util.List;

public interface DataAccessObject<T, I>{
	public int save(T t);
	public T getOne(I id);
	public List<T> getAll();
	public int update(T t);
	public int delete(I id);	
}
