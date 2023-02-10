package javaBasics.collectionVariables.arrays;

public class MinMax {
	public static void main(String[] args) {
		int num[] = {32,56,35,97,15};
		int i, sum=0;
		
		for(i=0; i<5; i++) {
			sum+=num[i];
		}
		int mean = sum/5;
		System.out.println("Average Value: "+mean);
		int min=num[0], max = num[0];
		for(i=1; i<5; i++) {
			if(min>num[i]) {
				min=num[i];
			}
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		System.out.println("mode: "+(min+max)/2);
	}
}
