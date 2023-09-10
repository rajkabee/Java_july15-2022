package com.rajkabee.j2se.oop.encapsulation;

public class App {
	public static void main(String[] args) {
		Transaction tx = new Transaction("John Wick", "Samantha Williams", 3400);
		tx.setSender("Pamela Morgan");
		tx.setReceiver("Juno Shrestha");
		tx.setAmount(4398);
//		tx.sender="Alex White";
//		tx.receiver="Walter Smith";
//		tx.amount=2000;
//		System.out.println("Sender: "+tx.sender
//				+"\nReceiver: "+tx.receiver
//				+"\nAmount: "+tx.amount);
		
		System.out.println(tx.getSender()+"\n"+tx.getReceiver()+"\n"+tx.getAmount());
		
	}
}
