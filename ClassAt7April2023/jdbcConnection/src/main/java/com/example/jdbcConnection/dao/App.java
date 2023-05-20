package com.example.jdbcConnection.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char ch;
		int i;
		ProductDao pDao = new ProductDao();
		System.out.println("------MAIN MENU------");
		System.out.println("a. Add a new Product");
		System.out.println("b. View a Product");
		System.out.println("c. View all Products");
		System.out.println("d. Update a Product");
		System.out.println("e. Delete a Product");
		System.out.println("Make a choice: ");
		ch = sc.next().charAt(0);
		sc.nextLine();
		if(ch=='a') {
			Product pd = getNewProductDetails();
			i=0;
			try {
				i=pDao.save(pd);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			if(i==1) {
				System.out.println("Product saved to the database successfully!!");
			}
			else {
				System.out.println("Product failed to be saved to the database!");
			}
			
		}
		else if(ch=='b') {
			int id;
			System.out.println("Enter the id of the product you want to view: ");
			id=sc.nextInt();
			Product pd=null;
			try {
				pd = pDao.getOne(id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(pd!=null) {
				System.out.println(pd);
			}
			else {
				System.out.println("Product not found!");
			}
			
		}
		else if(ch=='c') {
			ArrayList<Product> products=new ArrayList<>();
			try {
				products = pDao.getAll();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			if(products.size()>0) {
				products.forEach(System.out::println);
			}
			else {
				System.out.println("No products found!");
			}
			
		}
		else if(ch=='d') {
			Product pd = getUpdateProductDetails();
			i=0;
			try {
				i = pDao.update(pd);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			if(i==0) {
				System.out.println("Product Update Failed!");
			}
			else {
				System.out.println("Product updated successfully!");
			}
		}
		else if(ch=='e') {
			System.out.println("Enter the id of the product to be Deleted: ");
			int id = sc.nextInt();
			Product pd=null;
			try {
				pd = pDao.getOne(id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(pd!=null) {
				System.out.println(pd);
				System.out.println("Confirm Delete(y/n): ");
				ch = sc.next().charAt(0);
				if(ch=='y') {
					i=0;
					try {
						i = pDao.delete(id);
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(i==1) {
						System.out.println("Product Deleted from the database!");
					}
					else {
						System.out.println("Product delete failed!");
					}
				}
			}
			else {
				System.out.println("Product not found!");
			}
			
		}
	}

	private static Product getUpdateProductDetails() {
		Product p = new Product();
		System.out.println("Enter the Product Details to be updated: ");
		System.out.println("Id: ");
		p.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Name: ");
		p.setName(sc.nextLine());
		System.out.println("Manufacturer: ");
		p.setManufacturer(sc.nextLine());
		System.out.println("Description: ");
		p.setDescription(sc.nextLine());
		System.out.println("Price: ");
		p.setPrice(sc.nextFloat());
		System.out.println("Is Available(y/n): ");
		p.setActive(sc.next().charAt(0)=='y'?true:false);
		return p;
	}

	private static Product getNewProductDetails() {
		Product p = new Product();
		System.out.println("Enter the new Product Details: ");
		System.out.println("Name: ");
		p.setName(sc.nextLine());
		System.out.println("Manufacturer: ");
		p.setManufacturer(sc.nextLine());
		System.out.println("Description: ");
		p.setDescription(sc.nextLine());
		System.out.println("Price: ");
		p.setPrice(sc.nextFloat());
		System.out.println("Is Available(y/n): ");
		p.setActive(sc.next().charAt(0)=='y'?true:false);
		return p;
	}
}
