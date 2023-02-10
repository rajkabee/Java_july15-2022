package javaBasics.intro.oop.abstraction.dao;

public class App {
	public static void main(String[] args) {
		StudentDao sDao = new StudentDao();
		sDao.save(new Student());
		System.out.println(sDao.getOne(2));
	}
}
