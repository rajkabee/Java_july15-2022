package com.rajkabee.j2se.oop.encapsulation2;

import com.rajkabee.j2se.oop.encapsulation.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction tx = new Transaction();
		tx.setSender("Alex White");
		tx.setReceiver("Walter Smith");
		tx.setAmount(2000);
		System.out.println("Sender: "+tx.getSender()
				+"\nReceiver: "+tx.getReceiver()
				+"\nAmount: "+tx.getAmount());
	}
}
