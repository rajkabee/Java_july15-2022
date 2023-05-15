package j2se.dursikshya.loops;

public class Fibonacci {
	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21,34,55,89...
		int n1=0, n2=1, n3, count=0;
		while(count<47) {
			n3=n1+n2;
			System.out.print(n1+"  ");
			n1=n2;
			n2=n3;
			count++;
		}
	}
}
