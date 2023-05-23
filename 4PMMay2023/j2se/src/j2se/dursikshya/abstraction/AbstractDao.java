package j2se.dursikshya.abstraction;

public abstract class AbstractDao implements DAO {
	@Override
	public void connect() {
		System.out.println("Connected to the database!");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}
	
}
