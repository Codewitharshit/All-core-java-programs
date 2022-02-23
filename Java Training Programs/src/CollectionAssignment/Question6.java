package CollectionAssignment;

import java.util.LinkedList;
import java.util.List;

public class Question6 {
	List<Integer> A1;
	List<Integer> A2;
	int i;

	public List<Integer> SaveEvenNumbers(int N) {
		A1 = new LinkedList<Integer>();
		for (i = 2; i <= N; i++) {
			if ((i % 2) == 0) {
				A1.add(i);
			}

		}
		return A1;


	}

	public void PrintEvenNumbers() {
		A2 = new LinkedList<Integer>();

		for (int it : A1) {
			A2.add(it * 2);
			System.out.println(it * 2);
		}
		System.out.println("---------------------");
	}

	public void printEvenNumber(int N) {
		if (A1.contains(N)) {
			System.out.println("N found");
		} else {
			System.out.println("N not found");
		}
	}

	public static void main(String[] args) {
		Question6 obj = new Question6();
		obj.SaveEvenNumbers(20);
		obj.PrintEvenNumbers();
		obj.printEvenNumber(20);

	}

}
