package coreJava.basics.multiThreading;

public class App {
	public static void main(String[] args) {
		int value = 100;
		MyThread thread1 = new MyThread("One");
		MyThread thread2 = new MyThread("Two");
		MyRunnable runnable1 = new MyRunnable("Three");
		//Thread thread = new Thread(runnable1);
		thread1.start();
		thread2.start();
		runnable1.run();
		//thread.start();
	}
}
