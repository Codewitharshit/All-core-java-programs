package exceptionHandlingDemo;
//
import java.util.Scanner;

class UnderAgeException extends Exception {
	public UnderAgeException(String msg) {
		super(msg);
	}
}

public class NameAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		try {
			if (age < 18 && age <= 60) {
				throw new UnderAgeException("Age is invalid");
			}
		} catch (UnderAgeException e) {
			System.out.println(e);
		}

	}

}
