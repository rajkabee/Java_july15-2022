package javaSE.dursikshya.example.multiThreading;

public class App {
	public static void main(String[] args) {
		int num[]= {0};
		MyThread thread1 = new MyThread("One", num[0]);
		MyThread thread2 = new MyThread("Two", num[0]);
		MyRunnable thread3 = new MyRunnable("Three", num[0]);
		thread1.start();
		thread2.start();
		thread3.run();
	}
}
