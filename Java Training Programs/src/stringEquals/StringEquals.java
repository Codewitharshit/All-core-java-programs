package stringEquals;

public class StringEquals {

	public static void main(String[] args) {
		String s="Harshit";
		String str = "Harshit";
		String sc = new String("Harshit");
		System.out.println(str.equals(s)); //Content in the string is compared
		System.out.println(sc.equals(sc));
		System.out.println(sc==s); //Memory Allocation is the key
		 

	}

}
