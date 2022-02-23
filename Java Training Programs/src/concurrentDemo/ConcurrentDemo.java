package concurrentDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentDemo {

	public static void main(String[] args) {
		
		//Set <String> s=new HashSet();
		//CopyOnWriteArrayList<String> s=new CopyOnWriteArrayList<String>();
		CopyOnWriteArraySet<String> s=new CopyOnWriteArraySet<String>();
		s.add("Harshit");
		s.add("Dhruv");
		s.add("Rohit");
		s.add("Mahira");
		
		for(String e:s) {
			
			System.out.println(e);
			s.add("Hello");
			
		}
		System.out.println("--------------------------");
		for(String e:s) {
			//s.add("Hello");
			System.out.println(e);
			
		}
		

	}

}
