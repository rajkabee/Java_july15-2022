package com.rajkabee.j2se.control.conditional;

public class IfStatement {
	public static void main(String[] args) {
		int cashInHand = 1000;
		int creditLimit = 1000;
		int itemPrice = 2760;
		if(cashInHand>=itemPrice) {
			System.out.println("You can affors the item!");
		}
		else if(cashInHand+creditLimit>=itemPrice) {
			System.out.println("You can buy the item in credit!");
		}
		else {
			System.out.println("You cannot afford the item!");
		}
		
		
		System.out.println("End");
	}
}
