package j2se.eclipse.arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int num[]= {9,1,2,3,4,5,6,7,8};
		int i,j,k, flag;
		for(k=0; k<num.length; k++) {
			System.out.print(num[k]+"  ");
		}
		System.out.println();
		
		for(i=0; i<num.length-1; i++) {
			flag=0;
			for(j=0; j<num.length-1-i; j++) {
				if(num[j]>num[j+1]) {
					num[j]+=num[j+1];
					num[j+1]=num[j]-num[j+1];
					num[j]-=num[j+1];
					flag=1;
				}
				for(k=0; k<num.length; k++) {
					System.out.print(num[k]+"  ");
				}
				System.out.println();
			}
			if(flag==0) {
				break;
			}
		}
	}
}

/*
a=7;=12; =5;
b=5;=7;
a+=b;
b=a-b;
a-=b;


*/
