package com.rajkabee.j2se.threads;

public class MyRunnable implements Runnable{
	int threadId;
	public MyRunnable(int id) {
		this.threadId=id;
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Runnable "+threadId+" running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
