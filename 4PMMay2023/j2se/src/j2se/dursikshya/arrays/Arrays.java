package j2se.dursikshya.arrays;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int x[] = new int[5];
		int[] y = {5,4,3,2,1};
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter five numbers: ");
		int i;
//		for(i=0; i<5; i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(i=0; i<5; i++) {
//			System.out.println(arr[i]);
//		}
		
		int a[][] = {{1,2,3}, {4,5,6},{7,8,9},{10,11,12}};
		int j;
		for(i=0; i<4; i++) {
			for(j=0; j<3; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
	
	
	
}
