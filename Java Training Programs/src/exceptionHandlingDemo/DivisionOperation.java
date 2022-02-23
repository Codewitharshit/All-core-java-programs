package exceptionHandlingDemo;

public class DivisionOperation {

	public static void main(String[] args) throws ArithmeticException {
		try {
			int a = 3;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occured");
		}

	}

}
