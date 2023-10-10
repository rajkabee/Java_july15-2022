package com.sachistha.javaSE.threads;

public class App {
	public static void main(String[] args) throws InterruptedException {
		int i,j;
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("loop of i");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		
		thread1.start();
		MyThread thread2 = new MyThread(2);
		thread2.start();
		MyRunnable runnable3 = new MyRunnable(3);
		Thread runThread = new Thread(runnable3);
		runThread.start();
		for(j=0; j<10; j++) {
			System.out.println("loop of j");
			Thread.sleep(1000);
		}
	}
}
