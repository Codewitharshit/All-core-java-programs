package oops;

//Hierarical inheritence
class Parent {
	
	public void parentMethod() {
		int a = 10;
		int b = 20;
		
		System.out.println("Total is " + ( a + b));
	}
}

class Child1 extends Parent {
	public void child1Method() {
		System.out.println("chidmethod1 called");
	}
}

class Child2 extends Parent {
	public void child2Method() {
		System.out.println("child2Method called");
	}
}

public class HieraricalDemo {

	public static void main(String[] args) {
       Child1 c1 =new Child1();
       Child2 c2 =new Child2();
       c2.parentMethod();
       c1.parentMethod();
	}

}
