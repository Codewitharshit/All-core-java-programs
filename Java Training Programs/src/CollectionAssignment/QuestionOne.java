package CollectionAssignment;

import java.util.*;

public class QuestionOne {
	List<Integer> A1;
	List<Integer> A2;
	int product;
	int i;

	public void SaveEvenNumbers(int N) {
		A1 = new ArrayList<Integer>();
		for (i = 2; i <= N; i++) {
			if ((i % 2) == 0) {
				A1.add(i);
			}

		}
		
		for(int i=0;i<A1.size();i++) {
			System.out.println(A1.get(i));
		}
		System.out.println("___________________");


	}

	public void PrintEvenNumbers() {
		A2 = new ArrayList<Integer>();
		
		for( int it:A1) {
			A2.add(it*2);
			System.out.println(it*2);
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

		QuestionOne obj = new QuestionOne();
		obj.SaveEvenNumbers(20);
		obj.PrintEvenNumbers();
		obj.printEvenNumber(20);

	}

}
