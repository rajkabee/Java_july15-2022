package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class WhileLoopExample {
	public static void main(String[] args) {
		int i=0;			//init
		while(i<5) {		//while(con)
			System.out.println(i+". While Loop");
			i++;			//iteration
		}
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		i=1;
		while(i<=10) {
			System.out.println(num+" X "+i+" = "+num*i);
			i++;
		}
	}
}

/*
 
 syntax
 initialization;
 while(condition){
 	work to be repeated!
 	iteration;
 	}
  
 */
