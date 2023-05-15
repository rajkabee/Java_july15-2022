package j2se.dursikshya.arrays;

public class BubbleSortAlgorithm {
	public static void main(String[] args) {
		int x[]= {5,4,3,2,1};
		int i,j,k;
		for(i=0; i<4; i++) {
			for(j=0; j<x.length-1-i; j++) {
//				for(k=0; k<x.length; k++) {
//					System.out.print(x[k]+"  ");
//				}
//				System.out.println();
				if(x[j]>x[j+1]) {
					//swap
					x[j]+=x[j+1];
					x[j+1]=x[j]-x[j+1];
					x[j]-=x[j+1];
				}
			}
			System.out.println();
		}
		for(k=0; k<x.length; k++) {
			System.out.print(x[k]+"  ");
		}
	}
}
