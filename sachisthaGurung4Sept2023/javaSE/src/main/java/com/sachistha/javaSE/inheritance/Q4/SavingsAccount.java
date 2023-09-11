package com.sachistha.javaSE.inheritance.Q4;

public class SavingsAccount implements Account {
	float balance;
	float interestRate;
	@Override
	public boolean deposit(float amount) {
		balance+=amount;
		return true;
	}

	@Override
	public void withdraw(float amount) {
		if(balance>amount) {
			balance-=amount;
			System.out.println(amount + "rupees is withdrawn from your account. your new balance is "+balance);
		}
		else {
			System.out.println("You dont have sufficient amount in your account!");
		}

	}

	@Override
	public void balance() {
		System.out.println("You have "+balance);
	}

}
