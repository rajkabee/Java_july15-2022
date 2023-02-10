package myFirstJavaProject.collectionVariables;

public class TwoDimensionalArray {
public static void main(String[] args) {
	int num[][]= {
		{1,2,3,4,5},
		{3,4,5,2,7},
		{8,7,6,9,2}
	};
	String names[][] = new String[2][2];
	System.out.println(num[1][2]);
	names[0][0]="Sabin";
	names[0][1]="Nabin";
	names[1][0]="Kumar";
	names[1][1]="Goray";
	
	for(int i=0; i<2; i++) {
		for(int j=0; j<2; j++) {
			System.out.println(names[i][j]);
		}
	}
	System.out.println( );
	
	for(int i=0; i<3; i++) {
		for(int j=0; j<5; j++) {
			System.out.print(num[i][j]+"\t");
		}
		System.out.println();
		
	}
	
}
	
}
