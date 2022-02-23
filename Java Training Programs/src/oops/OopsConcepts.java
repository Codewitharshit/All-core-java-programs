package oops;

class MyClass {
	private int a;
	private int b;
	static String c;

	public void input() {
		a = 50;
		b = 60;
	}

	public void output() {
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
	}

	public String toString() {
		return "toString() Method is called";
	}
}

public class OopsConcepts {

	public static void main(String[] args) {
		MyClass.c = "abc";
		MyClass obj = new MyClass();
		System.out.println(obj);
		obj.input();
		obj.output();
		System.out.println(obj.c);
		MyClass obj2 = new MyClass();
		System.out.println(obj2.c);
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

	}

}
