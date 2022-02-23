package MultipleThreading;

class TotalEarning extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				total = total + 100;
				this.notify();
			}
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		TotalEarning te = new TotalEarning();
		te.start();
		// System.out.println("Total Earnings "+te.total+" rs");

		// printing 0 because both the threads are running simentaneously and when main
		// thread will run it would have printed zero already because Total earning
		// Thread will take time.
		// So what we want is to print the value of total after the whole thread
		// executes but the question is how can we do that so inter communication thread
		// come into play.

		synchronized (te) {
			try {
				te.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Total Earning = " + te.total + " rs");
		}
	}

}
