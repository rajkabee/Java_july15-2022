package com.rajkabee.j2se.threads;


public class App {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread(1);
		MyThread thread2 = new MyThread(2);
		MyRunnable runnable = new MyRunnable(3);
		Thread thread3 = new Thread(runnable); 
		thread1.start();
		thread2.start();
		thread3.start();
		for(int i=0; i<5; i++) {
			System.out.println("Hi");
			Thread.sleep(1500);
		}
	}
	
}
