package coreJava.basics.OOP.concepts.encapsulation;

public class App {
	public static void main(String[] args) {
		Student st = new Student();
		st.setId(123);
		st.setName("Ankit Shrestha");
		st.setEmail("Ankit@gmail.com");
		st.setPercentage(76.98f);
		System.out.println(st.getId()+". "+st.getName()+"\t"+
						st.getEmail()+"\t"+st.getPercentage());
				
	}
}
