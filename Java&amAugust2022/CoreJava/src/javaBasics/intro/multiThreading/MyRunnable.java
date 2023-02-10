package javaBasics.intro.multiThreading;

public class MyRunnable implements Runnable {
	int runnableId;
	public MyRunnable(int runnableId) {
		this.runnableId = runnableId;
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Runnable "+runnableId+" Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
