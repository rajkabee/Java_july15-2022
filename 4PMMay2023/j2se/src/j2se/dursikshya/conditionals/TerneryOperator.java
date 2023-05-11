package j2se.dursikshya.conditionals;

public class TerneryOperator {
	public static void main(String[] args) {
		int age=9;
		//String msg=age<18?"minor":"adult";
		String msg=age<18?"minor":age<60?"adult":"Senior";
		System.out.println(msg);
	}
}
