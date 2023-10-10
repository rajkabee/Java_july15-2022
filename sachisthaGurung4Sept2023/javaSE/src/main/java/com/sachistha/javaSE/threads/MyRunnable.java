package com.sachistha.javaSE.threads;

public class MyRunnable implements Runnable{

	int threadId;
	public MyRunnable(int threadId) {
		this.threadId=threadId;
	}
	
	@Override
	synchronized
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread "+threadId+" Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
