package coreJava.basics.multiThreading;

public class MyThread extends Thread {
	String threadId;
	
	public MyThread(String threadId) {
		this.threadId = threadId;
	}
	@Override
	synchronized public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread "+threadId+" running...");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
