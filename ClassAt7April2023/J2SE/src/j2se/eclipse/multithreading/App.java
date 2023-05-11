package j2se.eclipse.multithreading;

public class App {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread(1);
		MyThread thread2 = new MyThread(2);
		MyThread thread3 = new MyThread(3);
		MyRunnable runnable4 = new MyRunnable(4);
		MyRunnable runnable5 = new MyRunnable(5);
		Thread thread4 = new Thread(runnable4);
		Thread thread5 = new Thread(runnable5);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
