package thread_Assignments;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " * " + (i + 1) + "=" + i * (i + 1));
		}
	}
}

public class ThreadDemoRunnable {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
	}
}