package com.rajkabee.mavenHelloWorld.threads;

public class MyRunnable implements Runnable{
	int threadid;
	public MyRunnable(int threadid) {
		this.threadid=threadid;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i+". thread "+threadid+  " runninng");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
