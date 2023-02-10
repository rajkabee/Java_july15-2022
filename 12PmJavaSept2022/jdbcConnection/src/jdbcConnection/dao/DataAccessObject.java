package jdbcConnection.dao;

import java.util.List;

public interface DataAccessObject<T> {
	public void connect();
	public void disconnect();
	public int save(T t);
	public T getById(int id);
	public List<T> getAll();
	public int update(T t);
	public int delete (int id);
}
