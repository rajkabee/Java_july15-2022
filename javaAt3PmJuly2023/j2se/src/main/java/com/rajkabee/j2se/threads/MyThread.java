package com.rajkabee.j2se.threads;

public class MyThread extends Thread{
	int threadId;
	public MyThread(int id) {
		this.threadId=id;
	}
	@Override
	synchronized
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("thread "+threadId+" running...");
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
