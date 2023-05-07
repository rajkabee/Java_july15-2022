package j2se.eclipse.methods;

public class PassByRef {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		System.out.println("Inside main a: "+a[0]);
		change(a);
		System.out.println("Inside main a: "+a[0]);
		
		
	}
	static void change(int a[]) {
		a[0]=2334;
		a[1]=342;
		a[2]=432;
		System.out.println("Inside change a: "+a[0]);
	}
}
