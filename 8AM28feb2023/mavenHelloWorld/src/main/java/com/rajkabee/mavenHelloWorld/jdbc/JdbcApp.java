package com.rajkabee.mavenHelloWorld.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class JdbcApp {
	static Scanner sc;

	public static void main(String[] args) {
		char ch;
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/swingapp";
		String dbUsername = "root";
		String dbPassword = "root";
		ProductDao pDao = new ProductDao(driverClass, dbUrl, dbUsername, dbPassword);
		sc = new Scanner(System.in);

		do {
			System.out.println("------MENU------");
			System.out.println("a. Add New Product");
			System.out.println("b. View a Product");
			System.out.println("c. View All Products");
			System.out.println("d. Update a Product");
			System.out.println("e. Delete a Product");
			do {
				System.out.println("Choice: ");
				ch = sc.next().charAt(0);
			} while (!((ch > 96 && ch < 102) || (ch > 64 && ch < 70)));

			if (ch == 'a' || ch == 'A') {
				Product p = getNewProductDetails();
				int i = 0;
				try {
					i = pDao.save(p);
				} catch (ClassNotFoundException | SQLException e) {
				}
				if (i == 1) {
					System.out.println("Products added to the database!");
				}
			} else if (ch == 'b' || ch == 'B') {
				System.out.println("Enter the id of the product: ");
				int id = sc.nextInt();
				Product p;
				try {
					p = pDao.getOne(id);
					if (p.getName() == null) {
						System.out.println("no product found!");
					} else {
						System.out.println(p);
					}
				} catch (ClassNotFoundException | SQLException e) {
					System.out.println("no product found!");
				}
			}
			else if(ch=='c'||ch=='C') {
				try {
					List<Product> products = pDao.getAll();
					products.forEach(System.out::println);
				} catch (ClassNotFoundException | SQLException e) {
				}
			}
			else if(ch=='d'||ch=='D') {
				Product p = getUpdateProductDetails();
				int i=0;
				try {
					i = pDao.update(p);
				} catch (ClassNotFoundException | SQLException e) {
					System.out.println("Product couldn't be updated!");
				}
				if(i==1) {
					System.out.println("Product Updated!");
				}
			}
			else if(ch=='e'||ch=='e') {
				System.out.println("Enter the id: ");
				int id = sc.nextInt();
				int i=0;
				try {
					i= pDao.delete(id);
				} catch (ClassNotFoundException | SQLException e) {
					System.out.println("Delete failed!");
				}
				if(i==1) {
					System.out.println("Product deleted!");
				}
			}

			do {
				System.out.println("Do you want to continue(y/n)?  ");
				ch = sc.next().charAt(0);
			} while (!(ch == 'Y' || ch == 'y' || ch == 'N' || ch == 'n'));

		} while (ch == 'y' || ch == 'Y');

	}

	private static Product getNewProductDetails() {
		char ch;
		Product p = new Product();
		sc.nextLine();
		System.out.println("Enter the product Details: \n Name: ");
		p.setName(sc.nextLine());
		System.out.println("Manufacturer: ");
		p.setManufacturer(sc.nextLine());
		do {
			System.out.println("Active(y/n): ");
			ch = sc.next().charAt(0);
		} while (!(ch == 'y' || ch == 'n' || ch == 'Y' || ch == 'N'));
		p.setActive(ch == 'y' ? true : ch == 'Y' ? true : false);
		return p;
	}
	private static Product getUpdateProductDetails() {
		char ch;
		Product p = new Product();
	
		System.out.println("Enter the product Details: \n Id: ");
		p.setId(sc.nextInt());
		System.out.println("Name: ");
		sc.nextLine();
		p.setName(sc.nextLine());
		System.out.println("Manufacturer: ");
		p.setManufacturer(sc.nextLine());
		do {
			System.out.println("Active(y/n): ");
			ch = sc.next().charAt(0);
		} while (!(ch == 'y' || ch == 'n' || ch == 'Y' || ch == 'N'));
		p.setActive(ch == 'y' ? true : ch == 'Y' ? true : false);
		return p;
	}
}
