package myFirstJavaProject.collectionVariables;

public class BubbleSort {
	public static void main(String[] args) {
		int num[] = {5,4,3,2,1};
		int i,j,t;
		for(i=0; i<num.length-1; i++) {
			for(j=0; j<num.length-1-i; j++) {
				if(num[j]>num[j+1]) {
					t=num[j];
					num[j]=num[j+1];
					num[j+1]=t;
				}
				for(t=0; t<num.length; t++) {
					System.out.print(num[t]+"\t");
				}
				System.out.println();
			}
		}
		
		
		
		
	}
}
