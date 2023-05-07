package j2se.eclipse.arrays;

public class ArraysExample {
	public static void main(String[] args) {
		int[] arr=new int[50];
		//int[] num = new int[]{5,4,7,8,3};
		int[] num = {5,4,7,8,3,3,5,4,8,9,1};
		arr[0]=123;
		arr[1]=321;
		arr[2]=231;
		arr[3]=213;
		arr[4]=132;
		
		int i;
		//System.out.println(arr[4]);
		for(i=0; i<50; i++) {
			arr[i]=i*i+i;
		}
		
		for(i=0; i<50; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("num: ");
		for(i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
