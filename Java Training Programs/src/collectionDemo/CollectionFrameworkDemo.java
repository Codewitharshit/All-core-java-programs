package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {

//		List<String> ls = new ArrayList();

		Set<String> ls = new TreeSet();

		ls.add("Jack");
		ls.add("Harshit");
		ls.add("Rohit");

		ls.add("Jack");
		ls.add("Harshit");
		ls.add("Rohit");

		System.out.println(ls);
//		 Arraylist can accept duplicate data
//		System.out.println("-----------------------------");
//
//		Collections.sort(ls);
//		System.out.println(ls);
//		System.out.println("-----------------------------");
//
//	System.out.println(ls.get(3));
//
//		for (int i = 0; i < ls.size(); i++) {
//			System.out.println(ls.get(i));
//
//			System.out.println("-----------------------------");
//
//			Iterator it = ls.iterator();
//			while (it.hasNext()) {
//				System.out.println(it.next());
//			}
//
//			System.out.println("-----------------------------");
//
//			for (String s : ls) {
//                System.out.println(s);
//			}
//		}

	}

}
