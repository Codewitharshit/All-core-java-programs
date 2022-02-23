package stringCompareTo;

public class StringCompareTo {

	public static void main(String[] args) {
		String s1="Harshit ";
		String s2 ="HarshitA";
		String str ="abcdef";
		String str2 ="Abcde";
		System.out.println(s1.compareTo(s2));
		System.out.println(str.compareTo(str2));
		System.out.println(s2.compareTo(str2));
        System.out.println(s1.compareTo(str));
	}

}
