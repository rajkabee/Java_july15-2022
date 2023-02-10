package javaBasics.collectionVariables.arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int num[] = {9,8,6,5,3};
		int i,j,t;
		for(i=0; i<4; i++) {
			for(j=i+1; j<5; j++) {
				if(num[i]>num[j]) {
					t = num[i];
					num[i]=num[j];
					num[j]=t;
				}
				for(t=0; t<5; t++) {
					System.out.print(num[t]+"\t");
				}
			}
		}
		
	}
}
