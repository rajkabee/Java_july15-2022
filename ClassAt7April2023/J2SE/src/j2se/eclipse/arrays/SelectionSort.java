package j2se.eclipse.arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int num[]= {5,4,3,2,1};
		int i,j,min;//4
		for(i=0; i<4; i++) {
			for(int k=0; k<5; k++) {
				System.out.print(num[k]+"  ");
			}
			System.out.println();
			min=i;
			for(j=i+1; j<5; j++) {
				if(num[min]>num[j]) {
					min=j;
				}
			}
		//swap num[i]<>num[min]
			if(i!=min) {
				num[i]+=num[min];
				num[min]=num[i]-num[min];
				num[i]-=num[min];
			}
		}
		for(int k=0; k<5; k++) {
			System.out.print(num[k]+"  ");
		}
		
		
	}
}
