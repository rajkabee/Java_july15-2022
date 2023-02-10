package coreJava.basics.multiThreading;

public class MyRunnable implements Runnable {

	String threadId;

	public MyRunnable(String threadId) {
		this.threadId = threadId;
	}
	@Override
	synchronized public void run() {
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
