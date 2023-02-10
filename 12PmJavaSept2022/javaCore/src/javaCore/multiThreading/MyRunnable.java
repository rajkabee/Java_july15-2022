package javaCore.multiThreading;

public class MyRunnable implements Runnable {

String name;
	
	public MyRunnable(String name) {
		this.name=name;
	}
	
	@Override
	synchronized public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
