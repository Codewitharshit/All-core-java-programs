package collectionDemo;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("USA", "Washington");
		map.put("India", "Delhi");
		map.put("China", "Beijing");
		// map.put("China","Delhi");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get("India"));
		System.out.println(map.containsKey("Japan"));
		System.out.println(map.containsValue("Delhi"));
		map.replace("USA", "ABX");
		System.out.println(map.get("USA"));

		System.out.println("-------------------");
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + "=" + me.getValue());
		}

	}

}
