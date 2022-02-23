package CollectionAssignment;

import java.util.*;

public class Question3 {
	public static void printAll() {
		List<String> ls = new ArrayList<String>();
		ls.add("Harshit");
		ls.add("Jack");
		ls.add("Rohan");

		Iterator it = ls.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void main(String[] args) {
		Question3.printAll();
	}
}
