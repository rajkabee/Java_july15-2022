package j2se.eclipse.interfaces;

import java.util.List;

public interface DAO<T> extends DbConnect{
	public int x = 123;

	public int save(T t);
	public T getOne(int id);
	public List<T> getAll();
	public int update (T t);
	public int delete(int id);
}
