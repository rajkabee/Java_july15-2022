package javaBasics.controlStatement.loops.nested;

public class PrimeRange {
	public static void main(String[] args) {
		int num;
		int i, flag;
		for(num=2; num<=100; num++) {
			flag=0;
			for(i=2; i<=(num/2); i++) {
				if(num%i==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(num);
			}
		}
	}
}
