package webapp.entity;

public class Product {
	int id;
	String name;
	int QuantityInStock;
	float unitPrice;
	public Product(int id, String name, int quantityInStock, float price) {
		super();
		this.id = id;
		this.name = name;
		QuantityInStock = quantityInStock;
		this.unitPrice = price;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantityInStock() {
		return QuantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		QuantityInStock = quantityInStock;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float price) {
		this.unitPrice = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", QuantityInStock=" + QuantityInStock + ", price=" + price
				+ "]";
	}
	
}
