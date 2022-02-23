package stringMethods;

public class StringMethods {

	public static void main(String[] args) {
		//String nameO =" Harshit ";
		char ch[]= {'H','a','r','s','h','i','t'};
		String name = new String(ch);
		
				
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.replace('a','e'));
		System.out.println(name.indexOf('a'));
		System.out.println(name.equalsIgnoreCase("HARSHIT"));
		System.out.println(name.equalsIgnoreCase("HARSHITA"));
		System.out.println(name.trim()+"LearningJava");
		System.out.println(name.endsWith("shit"));
		System.out.println(name.startsWith("Har"));
		System.out.println(name.substring(3,5));
		

	}

}
