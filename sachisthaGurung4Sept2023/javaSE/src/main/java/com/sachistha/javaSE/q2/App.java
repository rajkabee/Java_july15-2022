package com.sachistha.javaSE.q2;

public class App {
	public static void main(String[] args) {
		Book book = new Book(123, "Harry Potter", "JK Rowling", Book.Status.IN);
		book.display();
	}
}
