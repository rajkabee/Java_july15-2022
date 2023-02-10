package myFirstJavaProject.multiThreading;

public class MultithreadingExample {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		MyThread thread1 = new MyThread("one", num);
		MyThread thread2 = new MyThread("two", num);
		MyRunnable runnable1 = new MyRunnable("three", num);
		Thread thread4 = new Thread(runnable1);
		thread1.start();
		thread2.start();
		//runnable1.run();
		thread4.start();
	}
}
