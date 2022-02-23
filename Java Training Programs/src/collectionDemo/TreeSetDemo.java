package collectionDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> s = new TreeSet();
		s.add("Jack");
		s.add("Harshit");
		s.add("Rohit");

		s.add("Jack");
		s.add("Harshit");
		s.add("Rohit");

		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
