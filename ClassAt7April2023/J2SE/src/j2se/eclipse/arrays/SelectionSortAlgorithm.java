package j2se.eclipse.arrays;

public class SelectionSortAlgorithm {
	public static void main(String[] args) {
		int n[]= {4,6,5,8,1,9,2,3,7};
		int min,i,j,k;
		for(i=0; i<n.length-1; i++) {

			min=i;
			for(j=min+1; j<n.length; j++) {
				if(n[min]<n[j]) {
					min=j;
				}
			}
			if(i!=min) {
				n[i]+=n[min];
				n[min]=n[i]-n[min];
				n[i]-=n[min];
			}
			
			for(k=0; k<n.length; k++) {
				System.out.print(n[k]+"  ");
			}
			System.out.println();
			
		}
		
	}
}
