package jdbcConnection.dao;

import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		char ch;
	do {
		ProductDao pDao = new ProductDao();
		System.out.println("------Main Menu------");
		System.out.println("a. add a product");
		System.out.println("b. view a product");
		System.out.println("c. view all products");
		System.out.println("d. update a product");
		System.out.println("e. delete a product");
		System.out.println("Choice: ");
		ch=sc.next().charAt(0);
		
		
		if (ch=='a') {
			System.out.println("Enter new Product Details: ");
			Product product = getProductDetails();
			int i = pDao.save(product);
			if(i==1) {
				System.out.println("Product saved to the database!");
			}
		}
		else if(ch=='b') {
			System.out.println("Enter the id of the product: ");
			int id = sc.nextInt();
			Product p = pDao.getById(id);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("Product not found...");
			}
		}
		else if(ch=='c') {
			List<Product> products = pDao.getAll();
			products.forEach(product->System.out.println(product));
		}
		else if (ch=='d') {
			System.out.println("Enter the id of the product: ");
			int id = sc.nextInt();
			Product p = pDao.getById(id);
			if(p!=null) {
				System.out.println(p);
				System.out.println("Enter updated Product Details: ");
				Product product = getProductDetails();
				product.setId(id);
				int i = pDao.update(product);
				if(i==1) {
					System.out.println("Product updated to the database!");
				}
			}
			else {
				System.out.println("Product couldn't be found...");
			}
			
		}
		
		else if(ch=='e') {
			System.out.println("Enter the id of the product to be deleted: ");
			int id = sc.nextInt();
			int i=0;
			Product p = pDao.getById(id);
			if(p!=null) {
				System.out.println(p);
				System.out.println("Confirm Delete(y/n)");
				ch = sc.next().charAt(0);
				if(ch=='y') {
					i = pDao.delete(id);
				}
			}
			else {
				System.out.println("Product not found...");
			}
			if(i==1) {
				System.out.println("Product Deleted...");
			}
			else {
				System.out.println("Product could not be deleted...");
			}
		}
		System.out.println("press 'y' to return to main menu:  ");
		ch = sc.next().charAt(0);
	}while(ch=='y');
		
	}

	private static Product getProductDetails() {
		Product p=new Product();
		sc.nextLine();
		System.out.println("Product Name: ");
		p.setName(sc.nextLine());
		System.out.println("Product Manufacturer: ");
		p.setManufacturer(sc.nextLine());
		System.out.println("Product Description: ");
		p.setDescription(sc.nextLine());
		System.out.println("Unit Price: ");
		p.setPrice(sc.nextFloat());
		System.out.println("Is in Stock(y/n): ");
		p.setInStock(sc.next().charAt(0)=='y'?true:false);
		return p;
	}
}
