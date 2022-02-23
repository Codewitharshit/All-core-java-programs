package oops;

class ConstructorDemo {
	int a;
	int b;

	public ConstructorDemo(int a, int b) {
		a = 10;
		b = 20;
		this.a = a;
		this.b = b;
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		System.out.println("---------------");

	}

	public ConstructorDemo(int side) {
		System.out.println("Side of the square is " + side);
		System.out.println("Area of Square " + side * side);
		System.out.println("---------------");
	}

	public ConstructorDemo(float pi, int r) {
		System.out.println("Value of pi is " + pi);
		System.out.println("value of r is " + r);
		System.out.println("Area of circle is " + pi * r * r);
		System.out.println("----------------");
	}

}

public class Constructor {

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo(20, 40);
		ConstructorDemo obj1 = new ConstructorDemo(40);
		ConstructorDemo obj2 = new ConstructorDemo(3.14f, 40);

	}

	static {
		System.out.println("Our program will start from static block");
		System.out.println("----------------");
	}
}
