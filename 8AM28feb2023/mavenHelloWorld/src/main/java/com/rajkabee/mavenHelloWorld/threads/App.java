package com.rajkabee.mavenHelloWorld.threads;

public class App {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread(1);
		MyThread thread2 = new MyThread(2);
		MyRunnable runnable3 = new MyRunnable(3);
		thread1.start();
		thread2.start();
		runnable3.run();
	}
}
