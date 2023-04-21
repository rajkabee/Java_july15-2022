package javaSE.dursikshya.example.oop.abstraction;

public abstract class DataAccessObject<T> implements InterfaceDao<T> {
	public void connect() {
		System.out.println("Connected to the database!");
	}
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}
	
	public abstract void save(T t);
	public abstract T getOne(int id);
}
