package com.example.coreJava.multithreading;

public class MyThread extends Thread {
	public MyThread(String name) {
		this.setName(name);
	}

	@Override
	synchronized
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(this.getName()+" Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
