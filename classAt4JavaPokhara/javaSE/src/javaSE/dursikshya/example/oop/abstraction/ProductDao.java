package javaSE.dursikshya.example.oop.abstraction;

public class ProductDao extends DataAccessObject<Product> {
	@Override
	public void save(Product t) {
		System.out.println("Product saved to the database!");
	}
	@Override
	public Product getOne(int id) {
		return new Product();
	}
	

	

}
