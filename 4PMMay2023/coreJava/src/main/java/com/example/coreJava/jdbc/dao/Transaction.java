package com.example.coreJava.jdbc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	int id;
	String sender;
	String receiver;
	float amount;
	public Transaction(String sender, String receiver, float amount) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
	}
	
	
}
