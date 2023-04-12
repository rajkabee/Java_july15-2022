package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		int num,i;
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("Enter a number:");
			num = sc.nextInt();
			if(num<2) {
				System.out.println("Neither prime nor composite!");
			}
			else {
				for(i=2; i<num; i++) {
					if(num%i==0) {
						//composite
						break;
					}
				}
				if(i==num) {
					System.out.println("Prime number!");
				}
				else {
					System.out.println("Composite!");
				}
			}
			do {
				System.out.println("Do you want to repeat: ");
				ch = sc.next().charAt(0);
			}while(!(ch=='y'||ch=='Y'||ch=='n'||ch=='N'));
			
			
		}while(ch=='Y'||ch=='y');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		do{
			System.out.println("Enter a number less than 5: ");
			i=sc.nextInt();
		}while(i<5);
	}
}
