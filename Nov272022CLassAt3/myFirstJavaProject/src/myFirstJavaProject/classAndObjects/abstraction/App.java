package myFirstJavaProject.classAndObjects.abstraction;

public class App {
	public static void main(String[] args) {
		MyAbstractClass absObj = new Impl1();
		absObj.method1();
		absObj.method2();
		absObj.method3();
		MyAbstractClass absObj2 = new Impl2();
		absObj2.method1();
		absObj2.method2();
		absObj2.method3();
	}
}
