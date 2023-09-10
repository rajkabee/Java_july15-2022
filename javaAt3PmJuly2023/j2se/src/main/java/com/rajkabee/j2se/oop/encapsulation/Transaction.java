package com.rajkabee.j2se.oop.encapsulation;

public class Transaction {
	private String sender;
	private String receiver;
	private float amount;
	
	public void setSender(String sender) {
		this.sender=sender;
	}
	public String getSender() {
		return sender;
	}
	
	
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Transaction(String sender, String receiver, float amount) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
	}
	
	public Transaction() {
		super();
	}
	@Override
	public String toString() {
		return "Transaction [sender=" + sender + ", receiver=" + receiver + ", amount=" + amount + "]";
	}
	
	
}
