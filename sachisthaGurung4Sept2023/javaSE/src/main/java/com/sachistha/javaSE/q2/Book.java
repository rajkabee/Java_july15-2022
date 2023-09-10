package com.sachistha.javaSE.q2;

public class Book {
	int bookNumber;
	String author;
	String title;
	Status status;
	
	enum Status{
		IN, CHECKED_OUT
	}

	public Book(int bookNumber, String author, String title, Status status) {
		super();
		this.bookNumber = bookNumber;
		this.author = author;
		this.title = title;
		this.status = status;
	}
	
	void display(){
		System.out.println("Book{ \n"
							+"Book Number: "+this.bookNumber+"\n"
							+"Author: "+this.author+"\n"
							+"Title: "+this.title+"\n"
							+"Status: "+this.status+"\n"
							+"}"
				);
	}
	
	public static void main(String[] args) {
		Book book = new Book(123, "Harry Potter", "JK Rowling", Book.Status.IN);
		book.display();
	}
	
}
