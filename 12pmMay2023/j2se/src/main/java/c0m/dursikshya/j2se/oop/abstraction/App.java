package c0m.dursikshya.j2se.oop.abstraction;

public class App {
	public static void main(String[] args) {
		ProductDao pDao = new ProductDao();
		pDao.connect();
		pDao.save();
		pDao.delete();
		pDao.disconnect();
	}
}

interface DAO{
	public void connect();
	public void disconnect();
	public void save();
	public void get();
	public void update();
	public void delete();
}

abstract class AbstractDAO implements DAO{
	public void connect() {
		System.out.println("Connected to the database...");
	}
	public void disconnect() {
		System.out.println("Disconnected from the database");
	}

}
class ProductDao extends AbstractDAO{

	@Override
	public void save() {
		System.out.println("Product saved to the database!");
	}

	@Override
	public void get() {
		System.out.println("Product fetched from the database!");
	}

	@Override
	public void update() {
		System.out.println("Product updated in the database!");
	}

	@Override
	public void delete() {
		System.out.println("Product deleted from the database!");	
	}
	
}
