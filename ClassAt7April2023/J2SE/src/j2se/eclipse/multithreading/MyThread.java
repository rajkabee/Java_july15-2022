package j2se.eclipse.multithreading;

public class MyThread extends Thread{
	public int threadId;

	public MyThread(int threadId) {
		super();
		this.threadId = threadId;
	}
	@Override
	synchronized public void run() {
		int i;
		for(i=0; i<5; i++) {
			System.out.println("Thread "+threadId+" running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
