package javaBasics.intro.multiThreading;

public class App {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread(1);
		MyThread thread2 = new MyThread(2);
		MyRunnable runnable = new MyRunnable(3);
		Thread thread3 = new Thread(runnable);
		thread1.start();
		thread2.start();
		//runnable.run();
		thread3.start();
	}
}
