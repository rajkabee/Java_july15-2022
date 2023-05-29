package com.example.coreJava.multithreading;

public class App {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread 1");
		MyThread thread2 = new MyThread("Thread 2");
		MyThread thread3 = new MyThread("Thread 3");
		MyRunnable runnable1 = new MyRunnable("Runnable 1");
		MyRunnable runnable2 = new MyRunnable("Runnable 2");
		Thread thread4=new Thread(runnable1);
		Thread thread5=new Thread(runnable2);
		thread1.start();
		thread2.start();
		thread3.start();
		//runnable1.run();
		//runnable2.run();
		thread4.start();
		thread5.start();
	}
}
