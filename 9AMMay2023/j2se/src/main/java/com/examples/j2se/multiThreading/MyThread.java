package com.examples.j2se.multiThreading;

public class MyThread extends Thread{
	int threadId;

	public MyThread(int threadId) {
		super();
		this.threadId = threadId;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+". thread"+threadId+" Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
