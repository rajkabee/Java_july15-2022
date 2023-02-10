package myFirstJavaProject.variables;

public class Alphabets {
	public static void main(String[] args) {
		int n=97;
		for(int i=0; i<26; i++){
			System.out.print(String.format("%d", n+i)+"\t");
		}
	}
}
