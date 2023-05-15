package c0m.dursikshya.j2se.arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {8,7,2,9,6};
		int min, i, j, k;
		for(i=0; i<num.length-1; i++){
			for(k=0; k<num.length; k++) {
				System.out.print(num[k]+"  ");
			}
			System.out.println();
			min=i;
			for(j=i+1; j<num.length; j++) {
				if(num[min]>num[j]) {
					min=j;
				}
			}
			if(min!=i) {
				num[min]+=num[i];
				num[i]=num[min]-num[i];
				num[min]-=num[i];
				
			}
			
		}
		for(k=0; k<num.length; k++) {
			System.out.print(num[k]+"  ");
		}
	}
}
