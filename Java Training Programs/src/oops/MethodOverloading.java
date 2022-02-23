package oops;

class Test {
	static void Area(int a, int b) {
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		System.out.println("Area of rectangle is " + (a * b));
		System.out.println("-------------");
	}

	static void Area(int a) {
		System.out.println("Value of a is " + a);
		System.out.println("Area of square is " + (a * a));
		System.out.println("-------------");
	}

	static void Area(double pi, int r) {
		System.out.println("Value of pi is  is " + pi);
		System.out.println("Value of r is  is " + r);
		System.out.println("Area of Circle is " + (pi * r * r));
		System.out.println("-------------");
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Test.Area(4);
		Test.Area(4, 5);
		Test.Area(3.14, 5);

	}

}
