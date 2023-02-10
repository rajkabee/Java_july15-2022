package javaBasics.intro.oop.abstraction;

public abstract class AbstractService<T> {
	void showDetails(){
		System.out.println("you are using MySql Database");
	}
	abstract T getInstance(Object o);
}
