package j2se.eclipse.arrays;

public class Bubbles {
	public static void main(String[] args) {
		int num[]= {5,4,3,2,1};
		int i,j,k;
		for(i=0; i<num.length-1; i++) {
			for(j=0; j<num.length-1-i; j++) {
				for(k=0; k<num.length; k++) {
					System.out.print(num[k]+"  ");
				}
				System.out.println();
				if(num[j]>num[j+1]) {
					//swap
					num[j]+=num[j+1];
					num[j+1]=num[j]-num[j+1];
					num[j]-=num[j+1];
				}
			}
		}
		
		for(k=0; k<num.length; k++) {
			System.out.print(num[k]+"  ");
		}
		
		
		
	}
}


/*
	//swap
	a=5;=>7
	b=7;=>5
	t=a;=>5
	a=b;
	b=t; 
	
	a=5;=>12=>7
	b=7;=>5;
	a+=b;
	b=a-b;
	a-=b;
	

*/