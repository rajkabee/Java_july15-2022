package javaBasics.intro.multiThreading;

public class MyThread extends Thread {
	int threadId;
	public MyThread(int threadId) {
		this.threadId = threadId;
	}
	@Override
	public synchronized void run(){
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
