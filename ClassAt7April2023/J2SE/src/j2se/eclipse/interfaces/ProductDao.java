package j2se.eclipse.interfaces;

import java.util.List;

public class ProductDao extends AbstractDao<Product>{

	@Override
	public int save(Product t) {
		System.out.println("Product saved to the database!");
		return 0;
	}

	@Override
	public Product getOne(int id) {
		System.out.println("Product fetched from the database!");
		return null;
	}

	@Override
	public List<Product> getAll() {
		System.out.println("All Products fetched from the database!");
		return null;
	}

	@Override
	public int update(Product t) {
		System.out.println("Product updated in the database!");
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("Product deleted from the Database!");
		return 0;
	}

}
