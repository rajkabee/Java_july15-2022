package myFirstJavaProject.collectionVariables;

public class SelectionSort {
	public static void main(String[] args) {
		int num[]= {5,4,3,2,1};
		int i,j,t;
		for(i=0; i<4; i++)
		for(j=i+1; j<5; j++) {
			if(num[i]>num[j]) {
				num[i]+=num[j];
				num[j]=num[i]-num[j];
				num[i]-=num[j];
			}
			for(t=0; t<5; t++) {
				System.out.print(num[t]+"\t");
			}
			System.out.println();
		}
		
	}
}
