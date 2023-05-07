package j2se.eclipse.jumpStatements;

public class Continue {
	public static void main(String[] args) {
		int i = 0;
		while(i<100) {
			i++;
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
			
		}
	}
	
}
