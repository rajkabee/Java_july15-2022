package jdbcConnection;

public class Product {
	int id;
	String name;
	String manufacturer;
	String description;
	float price;
	boolean inStock;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String manufacturer, String description, float price, boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.inStock = inStock;
	}
	public Product(String name, String manufacturer, String description, float price, boolean inStock) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.inStock = inStock;
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", description="
				+ description + ", price=" + price + ", inStock=" + inStock + "]";
	}
	
	
}
