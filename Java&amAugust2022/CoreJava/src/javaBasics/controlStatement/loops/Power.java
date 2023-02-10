package javaBasics.controlStatement.loops;

public class Power {
	public static void main(String[] args) {
		int b = 2;
		int p = 5;
		int res=1;
		int i=0;
		while(i!=p) {
			res*=b;
			i++;
		}
		System.out.println(res);
	}
}
