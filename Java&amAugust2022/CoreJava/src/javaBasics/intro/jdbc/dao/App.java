package javaBasics.intro.jdbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char ch;
		ProductDao pDao = new ProductDao();
		do {
			do {
				System.out.println("------Main Menu------");
				System.out.println("a. Add a new Product");
				System.out.println("b. View a Product");
				System.out.println("c. View all Products");
				System.out.println("d. Update a Product");
				System.out.println("e. Delete a Product");
				ch = sc.next().charAt(0);
			}while(!(ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'));
			if(ch=='a') {
				System.out.println("Enter new product details: ");
				Product p = getProductDetails();
				int i=0;
				try {
					i=pDao.save(p);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(i==1) {
					System.out.println("Product saved to the database!");
				}
			}
			else if(ch=='b') {
				System.out.println("Enter the id of the product to be viewed: ");
				int id = sc.nextInt();
				Product p=new Product();
				try {
					p = pDao.getOne(id);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
				System.out.println(p);
				
			}
			else if(ch=='c') {
				ArrayList<Product> products =new ArrayList<>();
				try {
					products= pDao.getAll();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(Product p:products) {
					System.out.println(p);
				}
			}
			else if(ch=='d') {
				System.out.println("Enter the id of the product to be updated: ");
				int id = sc.nextInt();
				Product p=new Product();
				try {
					p = pDao.getOne(id);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
				System.out.println(p);
				do {
					System.out.println("Do you want to update(y/n)?");
					ch = sc.next().charAt(0);
				}while(!(ch=='y'||ch=='n'));
				if(ch=='y') {
					Product pd = getProductDetails();
					pd.id = p.getId();
					int i=0;
					try {
						i = pDao.update(pd);
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(i==1) {
						System.out.println("Product updated successfully!");
					}
					else {
						System.out.println("Error updating data!");
					}
				}
			}
			else if(ch=='e') {
				System.out.println("Enter the id of the product to be deleted: ");
				int id = sc.nextInt();
				Product p=new Product();
				try {
					p = pDao.getOne(id);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
				System.out.println(p);
				do {
					System.out.println("Confirm delete(y/n)?");
					ch = sc.next().charAt(0);
				}while(!(ch=='y'||ch=='n'));
				if(ch=='y') {
					int i=0;
					try {
						i = pDao.delete(id);
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(i==1) {
						System.out.println("Product deleted from the database!");
					}
					else {
						System.out.println("Product delete failed!");
					}
					
				}
			}
			
			do {
				System.out.println("Do you want to continue(y/n)?");
				ch = sc.next().charAt(0);
			}while(!(ch=='y'||ch=='n'));
			
			
		}while(ch=='y');
	
	
	}

	private static Product getProductDetails() {
		Product product = new Product();
		System.out.println("Product Name: ");
		sc.nextLine();
		product.setName(sc.nextLine());
		System.out.println("Product Manufacturer: ");
		product.setManufacturer(sc.nextLine());
		System.out.println("Product Description: ");
		product.setDescription(sc.nextLine());
		System.out.println("Product Price: ");
		product.setPrice(sc.nextFloat());
		System.out.println("Product Quantity: ");
		product.setQuantity(sc.nextInt());
		System.out.println("is Product in Stock(y/n): ");
		product.setInStock(sc.next().equalsIgnoreCase("y")?true:false);
		return product;
	}
}
