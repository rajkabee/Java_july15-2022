package com.example.jdbc.dao;

import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	static ProductDao pDao = new ProductDao();

	public static void main(String[] args) {
		char ch;

		do {
			System.out.println("------MENU-------");
			System.out.println("a. Add Product");
			System.out.println("b. View a Product");
			System.out.println("c. View all Products");
			System.out.println("d. Update a Products");
			System.out.println("e. Delete a Products");

			do {
				System.out.println("Choice: ");
				ch = sc.next().charAt(0);
			} while (!(ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e'));

			switch (ch) {
			case 'a':
				addNewProduct();
				break;
			case 'b':
				viewProduct();
				break;
			case 'c':
				viewProducts();
				break;
			case 'd':
				updateProduct();
				break;
			case 'e':
				deleteProduct();
			}
			do {
				System.out.println("do you want to continue(y/n)? ");
				ch = sc.next().charAt(0);
			} while (!(ch == 'y' || ch == 'n'));
		} while (ch == 'y');
	}

	private static void deleteProduct() {
		System.out.println("Enter the id of the product to be deleted: ");
		int id = sc.nextInt();
		Product pd = pDao.getOne(id);
		if (pd != null) {
			System.out.println("The product is: ");
			System.out.println(pd);
			char ch;
			do {
				System.out.println("Confirm Delete(y/n)? ");
				ch = sc.next().charAt(0);
			} while (!(ch == 'y' || ch == 'n'));
			if (ch == 'y') {
				int i = pDao.delete(pd.getPid());
				if (i == 1) {
					System.out.println("Product deleted!");
				} else {
					System.out.println("Product delete failed!");
				}
			} else {
				System.out.println("Product delete cancelled!");
			}
		} else {
			System.out.println("no such product found!");
		}

	}

	private static void updateProduct() {
		Product pd = getProductDetails("updated");
		int i = pDao.update(pd);
		if (i == 1) {
			System.out.println("Product Updated!");
		} else {
			System.out.println("Product update failed!");
		}

	}

	private static void viewProducts() {
		List<Product> products = pDao.getAll();
		if (products != null && products.size() > 0) {
			System.out.println("The products are: ");
			products.forEach(System.out::println);
		} else {
			System.out.println("No products found in the database!");
		}

	}

	private static void viewProduct() {
		System.out.println("Enter the id of the product: ");
		int id = sc.nextInt();
		Product pd = pDao.getOne(id);
		if (pd != null) {
			System.out.println("The product is: ");
			System.out.println(pd);
		} else {
			System.out.println("no such product found!");
		}

	}

	private static void addNewProduct() {
		Product pd = getProductDetails("new");
		int i = pDao.save(pd);
		if (i == 0) {
			System.out.println("Product couldn't be added to the database!");
		} else {
			System.out.println("Product added to the database!");
		}
	}

	private static Product getProductDetails(String msg) {
		Product pd = new Product();
		System.out.println("Enter Product details: ");
		if (msg.equalsIgnoreCase("updated")) {
			System.out.println("Id: ");
			pd.setPid(sc.nextInt());
		}

		System.out.println("Product Name: ");
		sc.nextLine();
		pd.setName(sc.nextLine());
		System.out.println("Product Description: ");
		pd.setDescription(sc.nextLine());
		System.out.println("Product Price: ");
		pd.setPrice(sc.nextDouble());
		return pd;
	}
}
