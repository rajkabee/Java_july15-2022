package j2se.dursikshya.abstraction;

public class ProductDao extends AbstractDao{

	@Override
	public void save() {
		System.out.println("Product Saved to the database!");
	}

	@Override
	public void getOne() {
		System.out.println("Product fetched from the database!");
	}

}
