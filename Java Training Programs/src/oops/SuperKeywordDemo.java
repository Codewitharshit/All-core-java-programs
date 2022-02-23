package oops;

class AnimalDemo {
	int a;

	public AnimalDemo(int a) {
		this.a = a;
		System.out.println("Constructor 1 " + a);
	}

	public void dog() {
		System.out.println("Husky is the best");
	}
}

class BreedDemo extends AnimalDemo {
	public BreedDemo(int x,int y) {
		super(50);
		System.out.println(y+" Constructor 2 " + x);
	}

	public void dog() {
		super.dog(); // superkeyword
		System.out.println("Yes but Golden retriever is the smartest");
	}
}

public class SuperKeywordDemo {

	public static void main(String[] args) {

		BreedDemo bd = new BreedDemo(10,20);
		bd.dog();
	}

}
