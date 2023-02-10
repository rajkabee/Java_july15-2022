package myFirstJavaProject.collectionVariables;

public class ArraysExample {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		nums[2]=34;
		String fruits[] = new String[5];
		fruits[0]="Apples";
		fruits[1]="Bananas";
		fruits[2]="papayas";
		fruits[3]="Grapes";
		fruits[4]="Mangoes";
		System.out.println(nums[2]);
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		//advanced for loop
		for(String fruit:fruits) {
			System.out.println("\t"+fruit);
		}
	}
}
