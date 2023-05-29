package com.example.coreJava.multithreading;

public class MyRunnable implements Runnable {
	String name;
	public MyRunnable(String name) {
		this.name=name;
	}
	synchronized
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(this.name+" Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
