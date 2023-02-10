package coreJava.basics.OOP.concepts.abstraction;

public class App {
	public static void main(String[] args) {
		//AbstractClass absClass = new AbstractClass();
		Student st = new Student();
		st.name = "Sanju Shrestha";
		StudentDao sDao = new StudentDao();
		sDao.connect();
		sDao.save(st);
		sDao.disconnect();
	}
}
