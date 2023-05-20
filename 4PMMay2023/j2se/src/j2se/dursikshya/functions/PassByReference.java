package j2se.dursikshya.functions;

public class PassByReference {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println("main: "+arr[0]);
		change(arr);
		System.out.println("main: "+arr[0]);
	}
	static void change(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]+=100;
		}
		System.out.println("Change: "+arr[0]);
	}
}
class Person{
	String name;
	String address;
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
}
