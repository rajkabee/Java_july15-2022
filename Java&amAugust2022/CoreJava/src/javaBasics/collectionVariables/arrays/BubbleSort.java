package javaBasics.collectionVariables.arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int num[] = {9,7,5,3,1};
		int i, j, t;
		for(i=0; i<4; i++) {
			for(j=0; j<4-i; j++) {
				for(t=0; t<5; t++) {
					System.out.print(num[t]+"\t");
				}
				System.out.println();
				if(num[j]>num[j+1]) {
					t=num[j];
					num[j]=num[j+1];
					num[j+1]=t;
				}
			}
		}
		System.out.println("Output: ");
		for(t=0; t<5; t++) {
			System.out.print(num[t]+"\t");
		}
	}
}
