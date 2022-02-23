package oops;

class Animal {
	public void dog() {
		System.out.println("Husky is the best");
	}
}

class Breed extends Animal {
	public void dog() {
	
		System.out.println("Yes but Golden retriever is the smartest");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Breed bd = new Breed();
		bd.dog();

	}

}
