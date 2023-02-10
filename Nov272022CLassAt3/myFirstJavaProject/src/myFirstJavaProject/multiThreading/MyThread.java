package myFirstJavaProject.multiThreading;

public class MyThread extends Thread {
	String threadId;
	int num[];
	public MyThread(String threadId, int num[]) {
		super();
		this.threadId = threadId;
		this.num=num;
	}
	@Override
	synchronized public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread "+threadId+" running!");
			num[i]*=3;
			System.out.println(num[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
