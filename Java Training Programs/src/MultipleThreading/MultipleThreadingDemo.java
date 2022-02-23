package MultipleThreading;

//class A extends Thread
class A implements Runnable

{
	public void run() {
		for (char ch = 65; ch <= 75; ch++) {
			System.out.println("Value of ch in A is " + ch);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		System.out.println("Thread A is exited");
	}
}

//class B extends Thread
class B implements Runnable {
	public void run() {
		for (char ch = 65; ch <= 75; ch++) {
			System.out.println("Value of ch in B is " + ch);

		}
		System.out.println("Thread B is exited");
	}
}

//class C extends Thread 
class C implements Runnable {
	public void run() {
		for (char ch = 65; ch <= 75; ch++) {
			System.out.println("Value of ch in C is " + ch);
		}
		System.out.println("Thread C is exited");
	}
}

public class MultipleThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);

		t1.start();
		// t1.setName("Harshit");
		t1.join();
		// t1.stop();
		// t1.suspend();
		t2.join();
		t2.start();

		t3.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);

		// t1.resume();
		// t1.yield();

//		obj1.start();
//		obj2.start();
//		obj3.start(); 
		// t1.interrupt();
//		t1.currentThread().join();
	}

}
