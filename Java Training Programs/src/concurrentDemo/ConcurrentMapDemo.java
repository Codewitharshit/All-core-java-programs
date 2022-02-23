package concurrentDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap();
		ConcurrentHashMap<String, String> map =new ConcurrentHashMap();
		map.put("USA", "Washington");
		map.put("India", "Delhi");
		map.put("China", "Beijing");
		
		Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
        	Map.Entry me = (Map.Entry)it.next();
        	System.out.println(me);
        	map.put("Japan", "Tokio");
        	
        	
        }
		
	}
	
}
