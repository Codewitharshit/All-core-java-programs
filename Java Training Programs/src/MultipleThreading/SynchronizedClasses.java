package MultipleThreading;

class BookMYShow {
	int total_tickets=10;
	synchronized public void bookTicket(int ticketsForBooking) {
		
		if (total_tickets >= ticketsForBooking) {

			total_tickets = total_tickets - ticketsForBooking;
			System.out.println(ticketsForBooking + " Tickets have been booked");
			System.out.println(total_tickets + " Tickets remaining");
		} else {
			System.out.println("Sorry No Tickets are Available");
		}

	}
}

public class SynchronizedClasses extends Thread {
	static BookMYShow book;
	int ticket;

	public SynchronizedClasses(int ticket) {
		this.ticket = ticket;
	}

	public void run() {
		book.bookTicket(ticket);
	}

	public static void main(String[] args) throws InterruptedException {
		book = new BookMYShow();
		SynchronizedClasses sc = new SynchronizedClasses(5);

		sc.start();
		
		
		SynchronizedClasses Harshit = new SynchronizedClasses(3);

		//Harshit.start();
		
		SynchronizedClasses Harsh = new SynchronizedClasses(1);

		Harsh.start();
		
		SynchronizedClasses jack = new SynchronizedClasses(1);

		jack.start();
		
		synchronized(Harshit) {
			//Harshit.wait();
			Harshit.start();
			
			
			
			
		}
		
	}

}
