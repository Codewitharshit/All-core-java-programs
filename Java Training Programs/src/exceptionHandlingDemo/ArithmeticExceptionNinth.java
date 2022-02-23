package exceptionHandlingDemo;

import java.util.Scanner;

public class ArithmeticExceptionNinth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input for variable a ");
		int a = sc.nextInt();
		System.out.println("Enter input for variable b ");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("The quotient of a/b is: " + c);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} finally {
			System.out.println("Inside Finally Block");
		}
	}

}
