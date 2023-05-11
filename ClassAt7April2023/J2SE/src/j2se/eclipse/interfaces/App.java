package j2se.eclipse.interfaces;

public class App {
	public static void main(String[] args) {
		ProductDao pDao = new ProductDao();
		pDao.connect();
		pDao.save(new Product());
		pDao.disconnect();
		System.out.println(pDao.x);
	}
}
