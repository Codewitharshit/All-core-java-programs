package oops;

class A {
	int x;

	public void show() {
		x = 50;
		System.out.println("Show method called ");
	}

	public void display() {
		System.out.println("Value of x is " + x);
	}
}

@FunctionalInterface
interface B {
	int s = 10;

	void in();

	public static void methodDemo() {
		System.out.println("This is Static method");
	}

	public default void defaultMethod() {
		System.out.println("This is Default method");
	}
	

}

class C extends A implements B {
	public void in() {
		System.out.println("Show method is called ");
	}
	public void defaultMethod() {
		System.out.println("This is Default method IN IMPLEMENTATION SECTION");
	}
	public void methodDemo() {
		System.out.println("This is Static method 2 ");
	}

	
}

public class MultipleInheritence {

	public static void main(String[] args) {
		C obj = new C();
		System.out.println(B.s);
		obj.show();
		obj.display();
		obj.in();
		B.methodDemo();
		obj.defaultMethod(); //Default method overriden,Also we can not override static methods
		
		

	}

}
