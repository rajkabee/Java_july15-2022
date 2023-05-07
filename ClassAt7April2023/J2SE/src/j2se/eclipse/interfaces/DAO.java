package j2se.eclipse.interfaces;

import java.util.List;

public interface DAO<T>{
	public void connect();
	public void disconnect();
	public int save(T t);
	public T getOne(int id);
	public List<T> getAll();
	public int update (T t);
	public int delete(int id);
}
