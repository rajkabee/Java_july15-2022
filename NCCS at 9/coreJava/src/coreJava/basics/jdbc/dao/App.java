package coreJava.basics.jdbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static Scanner sc;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Main Menu");
		System.out.println(" a. Add a plant \n b. View a plant \\n c. View all Plants");
		System.out.println(" d. Update a plant \n e. Delete a plant \n :");
		int i, id;
		Plant plant;
		PlantDao pDao = new PlantDao();
		sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='a') {
			plant = getPlant();
			i = pDao.save(plant);
			if(i==1) {
				System.out.println("Plant saved to the database!");
			}
			else {
				System.out.println("Plant could not be added to the database!");
			}
			
		}
		else if(ch=='b') {
			System.out.println("Enter the id: ");
			id= sc.nextInt();
			plant = pDao.getOne(id);
			System.out.println(plant);
			
		}
		else if(ch=='c') {
			ArrayList<Plant> plants = pDao.getAll();
			for(Plant p : plants) {
				System.out.println(p);
			}
		}
		else if(ch=='e') {
			System.out.println("Enter the id of the plant: ");
			id= sc.nextInt();
			plant = pDao.getOne(id);
			System.out.println(plant);
			System.out.println("Confirm Delete(y/n):");
			ch = sc.next().charAt(0);
			if(ch=='y') {
				i = pDao.delete(id);
				if(i==1) {
					System.out.println("Plant deleted from the database!");
				}
				else {
					System.out.println("Delete failed!");
				}
			}
			else {
				System.out.println("Delete Cancelled!");
			}
			
		}
		else if(ch=='d') {
			System.out.println("Enter the id of the plant: ");
			id= sc.nextInt();
			plant = pDao.getOne(id);
			System.out.println(plant);
			System.out.println("Enter the new details: ");
			plant = getPlant();
			plant.setId(id);
			i = pDao.update(plant);
			if(i==1) {
				System.out.println("Plant updated in the database!");
			}
			else {
				System.out.println("Update failed!");
			}		
		}
	}
	private static Plant getPlant() {
		Plant plant = new Plant();
		System.out.println("Enter the name: ");
		plant.setName(sc.next());
		System.out.println("Enter the price: ");
		plant.setPrice(sc.nextFloat());
		return plant;
	}
}
