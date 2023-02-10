package myFirstJavaProject.collectionVariables;

public class NumbersArray {
	public static void main(String[] args) {
		int num[] = {32,54,36,89,12, 56};
		int total=0;
		for(int i=0; i<num.length; i++) {
			total+=num[i];
		}
		System.out.println("Total: "+total);
		int mean = total/num.length;
		System.out.println("Mean Value: "+mean);
		int max=num[0];
		int min = num[0];
		for(int i=1; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("Max Value: "+max);
		System.out.println("Min Value: "+min);
	}
}
