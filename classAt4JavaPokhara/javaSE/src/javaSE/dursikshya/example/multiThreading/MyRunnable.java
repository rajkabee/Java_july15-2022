package javaSE.dursikshya.example.multiThreading;

public class MyRunnable implements Runnable{
	String threadId;
	int num;
	
	
	public MyRunnable(String threadId, int num) {
		super();
		this.num=num;
		this.threadId = threadId;
	}



	@Override
	synchronized public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(threadId+" Thread Running..."+num);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
