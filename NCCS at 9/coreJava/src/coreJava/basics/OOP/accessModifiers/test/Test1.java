package coreJava.basics.OOP.accessModifiers.test;

public class Test1 {
	public static void main(String[] args) {
		Student st = new Student();
		st.id = 12;
		st.name = "Samriddhi";
		st.setPercentage(87.34f);
		System.out.println(st.getPercentage());
		
	}
}
