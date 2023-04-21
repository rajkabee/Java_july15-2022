package javaSE.dursikshya.example.oop.abstraction;

public interface InterfaceDao<T> {
	public void connect();
	public void disconnect();
	
	public void save(T t);
	public T getOne(int id);
}
