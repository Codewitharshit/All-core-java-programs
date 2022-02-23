package exceptionHandlingDemo;
//Invalid country name
import java.util.Scanner;
class InvalidCountryException extends Exception{
	public InvalidCountryException(String msg) {
		super(msg);
	}
}

public class CountryException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = sc.nextLine();
		System.out.println("Enter userCountry");
		String userCountry = sc.nextLine();
		String s = "India";
		try {if (userCountry.equalsIgnoreCase(s)) {
			System.out.println("User registration done succesfully");
		} 
		else {
		 
			throw new InvalidCountryException("user outside India can not be registered");
		}
		}
		catch(InvalidCountryException e) {
			System.out.println(e);
		}
		}
		

	}


