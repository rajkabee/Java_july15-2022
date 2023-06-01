package com.example.coreJava.jdbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		String ch;
		int id, i;
		Transaction tx = new Transaction();
		TransactionDao tDao = new TransactionDao();
		do {
			System.out.println("------MENU------");
			System.out.println("a. create a transaction");
			System.out.println("b. view a transaction");
			System.out.println("c. view all transaction");
			System.out.println("d. update a transaction");
			System.out.println("e. cancel a transaction");
			do {
				System.out.println("Choice: ");
				ch = sc.nextLine();
			}while(!(
						ch.equalsIgnoreCase("a")||
						ch.equalsIgnoreCase("b")||
						ch.equalsIgnoreCase("c")||
						ch.equalsIgnoreCase("d")||
						ch.equalsIgnoreCase("e")
					));
			if(ch.equalsIgnoreCase("a")) {
				tx=getNewTransactionDetails();
				i = tDao.save(tx);
				if(i==0) {
					System.out.println("Transaction could not be saved!");
				}
				else {
					System.out.println("Transaction saved to the database!");
				}
			}
			else if(ch.equalsIgnoreCase("b")) {
				System.out.println("Enter the transaction id: ");
				id = sc.nextInt();
				sc.nextLine();
				tx = tDao.getOne(id);
				if(tx!=null) {
					System.out.println(tx);
				}
				else {
					System.out.println("Transaction not found!");
				}
			}
			else if(ch.equalsIgnoreCase("c")) {
				List<Transaction> transactions = tDao.getAll();
				if(transactions.size()>0) {
					transactions.forEach(System.out::println);
				}
				else {
					System.out.println("No transactions on the table!");
				}
			}
			else if(ch.equalsIgnoreCase("d")) {
				tx = getUpdatedTransactionDetails();
				i = tDao.update(tx);
				if(i==1) {
					System.out.println("Transaction updated...");
				}
				else {
					System.out.println("Transaction update failed!!!");
				}
			}
			else if(ch.equalsIgnoreCase("e")) {
				System.out.println("Enter the transaction id: ");
				id = sc.nextInt();
				sc.nextLine();
				tx = tDao.getOne(id);
				if(tx!=null) {
					System.out.println(tx);
					System.out.println("Confirm Delete(y/n): ");
					ch=sc.nextLine();
					if(ch.equalsIgnoreCase("y")) {
						i = tDao.delete(id);
						if(i==1) {
							System.out.println("Transaction deleted from the database!");
						}
						else {
							System.out.println("Deletion failed!!!");
						}
					}
					else {
						System.out.println("Deletion Cancelled!");
					}
				}
				else {
					System.out.println("Transaction not found!");
				}
			}
			do {
				
				System.out.println("Do you want to continue(y/n): ");
				ch = sc.nextLine();
			}while(!(ch.equalsIgnoreCase("y")||ch.equalsIgnoreCase("n")));
			
		}while(ch.equalsIgnoreCase("y"));
	}
	private static Transaction getUpdatedTransactionDetails() {
		System.out.println("Enter new Transaction Details: ");
		Transaction t = new Transaction();
		System.out.println("Transaction id: ");
		t.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Sender: ");
		t.setSender(sc.nextLine());
		System.out.println("Receiver: ");
		t.setReceiver(sc.nextLine());
		System.out.println("Amount: ");
		t.setAmount(sc.nextFloat());
		sc.nextLine();
		return t;
	}
	private static Transaction getNewTransactionDetails() {
		System.out.println("Enter new Transaction Details: ");
		Transaction t = new Transaction();
		System.out.println("Sender: ");
		t.setSender(sc.nextLine());
		System.out.println("Receiver: ");
		t.setReceiver(sc.nextLine());
		System.out.println("Amount: ");
		t.setAmount(sc.nextFloat());
		sc.nextLine();
		return t;
	}
}
