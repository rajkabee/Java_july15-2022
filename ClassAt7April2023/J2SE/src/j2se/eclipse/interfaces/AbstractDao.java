package j2se.eclipse.interfaces;

import java.util.List;

public abstract class AbstractDao<T> implements DAO<T> {

	@Override
	public void connect() {
		System.out.println("Connected to the database!");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}


}
