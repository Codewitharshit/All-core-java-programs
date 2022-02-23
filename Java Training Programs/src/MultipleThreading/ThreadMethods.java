package MultipleThreading;

public class ThreadMethods extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);

		}
		System.out.println(Thread.currentThread().getName() + "" + "is exited");
	}

	public static void main(String[] args) {
		ThreadMethods t = new ThreadMethods();

		t.start();
		Thread.yield(); 
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}
}
