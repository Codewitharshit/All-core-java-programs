package MultipleThreading;

class Hare extends Thread {
	public void run() {
		int i;
		for (i = 0; i <= 100; i++) {
			System.out.println("Hare completed " + i + " meters");
		}
		if (i == 60) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		if (i == 100) {
			System.out.println("Hare wins the race");
			System.exit(0);
		}

	}
}

class Tortoise extends Thread {
	public void run() {
		int i;
		for (i = 0; i <= 100; i++) {
			System.out.println("Tortoise completed " + i + " meters");
		}
		if (i == 100) {
			System.out.println("Tortoise wins the race");
			System.exit(0);
		}

	}
}

public class ThreadingAssignment {

	public static void main(String[] args) {

		Hare obj1 = new Hare();
		Tortoise obj2 = new Tortoise();

		obj1.start();
		obj2.start();
		
	}

}
