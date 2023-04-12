package javaSE.dursikshya.example.arrays;

public class SelectionSortAlgorithm {
	public static void main(String[] args) {
		int[] n = {5,4,3,2,1};
		int i, j, min, k;
		for(j=0; j<4; j++) {
			min=j;
			for(i=j+1; i<n.length; i++) {
				if(n[min]>n[i]) {
					min=i;
				}
				System.out.println(min);
			}
			if(j!=min) {
				n[j]+=n[min];
				n[min]=n[j]-n[min];
				n[j]-=n[min];
			}
			for(k=0; k<5; k++) {
				System.out.print(n[k]+"\t");
			}
			System.out.println();
		}
		
		
	}
}


/*
a=7, b=5;
a=a+b;
b=a-b;
a=a-b;

*/