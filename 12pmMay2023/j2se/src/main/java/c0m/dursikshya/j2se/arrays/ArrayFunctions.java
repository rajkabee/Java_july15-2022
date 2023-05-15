package c0m.dursikshya.j2se.arrays;

public class ArrayFunctions {
	public static void main(String[] args) {
		int n[] = {9,6,8,5,3};
		int i, j, t;
		for(i=0; i<4; i++) {
			for(j=0; j<n.length-1-i; j++) {
				if(n[j]>n[j+1]) {
					//swap
					t=n[j];
					n[j]=n[j+1];
					n[j+1]=t;
				}
			}
		}
		for(t=0; t<n.length; t++) {
			System.out.print(n[t]+"  ");
		}
		System.out.println();
		
		
	}
}
