package c0m.dursikshya.j2se.arrays;

public class Arrays {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int arr2[] = new int[5];
		int[] num = {1,2,3,4,5,7,6,8,9,2};
		num[0]=12;
		int i,j;
		for( i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		boolean attendance[][] = {{true, true, true, true, false, true},
									{true, true, true, false, true, true}
									};
		for(i=0; i<2; i++) {
			System.out.println("student"+i+": ");
			for(j=0; j<6; j++) {
				System.out.print((attendance[i][j]?1:0)+"\t");
			}
			System.out.println();
		}
	}
}
