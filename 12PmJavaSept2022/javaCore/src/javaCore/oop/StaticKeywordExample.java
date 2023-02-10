package javaCore.oop;

public class StaticKeywordExample {
	public static void main(String[] args) {
		/*
		Demo demo = new Demo();
		System.out.println(demo.msg1);
		System.out.println(demo.msg2);
		*/
		//System.out.println(Demo.msg1);
		//System.out.println(Demo.msg2);
		
		
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		demo1.firstname = "Sanjay";
		demo1.lastname = "Pajiyar";
		demo2.firstname = "Sanjeena";
		demo2.lastname = "Maharjan";
		
		Demo.firstname="this property belongs to the class not the the objects!";
		
		//System.out.println(demo1.firstname+"\n"+demo1.lastname);
		//System.out.println(demo2.firstname+"\n"+demo2.lastname);
		System.out.println(Demo.firstname);
	}
}
