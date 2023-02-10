package javaCore.multiThreading;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread threadOne =  new MyThread("One");
		MyThread threadTwo =  new MyThread("Two");
		MyRunnable runnableThree = new MyRunnable("Three");
		//Thread myThread = new Thread(runnableThree); 
		threadOne.start();
		threadTwo.start();
		runnableThree.run();
		//myThread.start();
	}
}
