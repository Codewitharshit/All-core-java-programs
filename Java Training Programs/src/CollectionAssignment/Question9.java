package CollectionAssignment;

import java.util.*;

class CountryMap {
	static Map M1 = new HashMap();

	public static HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return (HashMap<String, String>) M1;
	
	}

}

public class Question9 extends CountryMap {

	public static void main(String[] args) {

		CountryMap.saveCountryCapital("India", "Delhi");

		CountryMap.saveCountryCapital("Japan", "Tokio");
		System.out.println(M1);

	}

}
