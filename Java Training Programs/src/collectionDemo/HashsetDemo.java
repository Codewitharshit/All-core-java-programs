package collectionDemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class HashsetDemo {

	public static void main(String[] args) {
		Set <String> s=new HashSet();
		s.add("Jack");
		s.add("Harshit");
		s.add("Rohit");
		
		s.add("Jack");
		s.add("Harshit");
		s.add("Rohit");
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
