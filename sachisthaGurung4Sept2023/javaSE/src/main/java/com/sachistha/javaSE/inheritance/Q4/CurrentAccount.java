package com.sachistha.javaSE.inheritance.Q4;

public class CurrentAccount implements Account {

	float balance;
	float overDraftLimit;
	@Override
	public boolean deposit(float amount) {
		balance+=amount;
		return true;
	}

	@Override
	public void withdraw(float amount) {
		if(balance+overDraftLimit>amount) {
			balance-=amount;
			System.out.println(amount + "rupees is withdrawn from your account. your new balance is "+balance);
		}
		else {
			System.out.println("You don't have sufficient amount in your account!");
		}

	}

	@Override
	public void balance() {
		System.out.println("You have "+balance+" Rupees in your account!"	+" Rupees in your account! you overDraft limit is "+overDraftLimit);
	}

}
