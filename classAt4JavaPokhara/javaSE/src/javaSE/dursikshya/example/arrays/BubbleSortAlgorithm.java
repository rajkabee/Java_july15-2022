package javaSE.dursikshya.example.arrays;

public class BubbleSortAlgorithm {
	public static void main(String[] args) {
		int[] num = {5,4,3,2,1};
		int i, t, k, j;
		
		for(j=0; j<4; j++) {
			for(i=0; i<4-j; i++) {
				if(num[i]>num[i+1]) {
					t=num[i];
					num[i]=num[i+1];
					num[i+1]=t;
				}
				
				//System.out.println();
			}
		}
		for(k=0; k<5; k++) {
			System.out.print(num[k]+"\t");
		}
		
	}
}
