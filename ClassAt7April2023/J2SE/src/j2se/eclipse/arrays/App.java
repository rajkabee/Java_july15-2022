package j2se.eclipse.arrays;

public class App {
	public static void main(String[] args) {
		int marks[] = {57,67,78,83,54,34,56,67,89,87,65};
		int num[] = new int[50];
		System.out.println(marks[4]);
		
		
		int i;
		int total=0;
		for(i=0; i<11; i++) {
			total+=marks[i];
		}
		float percentage=Float.parseFloat(total+"")/11;
		System.out.println(percentage);
	}
}
