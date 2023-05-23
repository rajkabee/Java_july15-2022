package com.examples.j2se.multiThreading;

public class MyRunnable implements Runnable {
	int threadId;
	public MyRunnable(int threadId) {
		super();
		this.threadId = threadId;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+". thread"+threadId+" Running...");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
