package MultipleThreading;

class A1 extends Thread {
	public void run() {
		System.out.println("Entered in class A1");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("value of i in A1 is  " + i);
		}
		System.out.println("Class A1 exited ");
	}
}

class A2 extends Thread {
	public void run() {
		System.out.println("Entered in class A2");
		for (int j = 0; j < 10; j++) {
			
			System.out.println("value of i in A2 is  " + j);
		}
		System.out.println("Class A2 exited ");
	}
}

public class MondaySessionPractice {

	public static void main(String[] args) {
//		Thread t = new Thread();
//		System.out.println(t.currentThread());  
//		t.setName("Thread1");

		A1 a = new A1();
		A2 a2 = new A2();
		a.start();
		//a.suspend();
		a.yield(); 
//		try {a2.join();
//		
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		//a2.join();
		//a.interrupt();
		a2.start();
		//a.resume();
		
	}

}
