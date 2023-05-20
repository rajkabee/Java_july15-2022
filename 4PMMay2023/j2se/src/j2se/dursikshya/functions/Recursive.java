package j2se.dursikshya.functions;

public class Recursive {
	public static void main(String[] args) {
		int n=10;
		int res = sum(n);
		System.out.println("Res: "+res);
	}

	private static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}
	
	static int sumOfDigits(int num){		//1234
		if(num==0) {
			return 0;
		}
		return num%10+sumOfDigits(num/10);
	}
	
}
/*
sod(1234)
4+sod(123)
4+3+sod(12)
4+3+2+sod(1)
4+3+2+1+sod(0)
4+3+2+1+0
10
 */


/*
n=4
sum(4)
4+sum(3)
4+3+sum(2)
4+3+2+sum(1)
4+3+2+1+sum(0)
4+3+2+1+0
10


*/