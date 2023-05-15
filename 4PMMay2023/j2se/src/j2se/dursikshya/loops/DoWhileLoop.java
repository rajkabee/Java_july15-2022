package j2se.dursikshya.loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i=100;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(". Do While Loop!");
			System.out.println("Enter a value less than 5: ");
			i=sc.nextInt();
		}while(i<5);
	}
}
/*
syntax
init;
do {
	statement block;
	iter;
}while(con);

*/