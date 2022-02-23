package stringAssignmentDemo;
//Ignoring upper case
public class StringAssignment {

	public static void main(String[] args) {
		String s ="harShit";
		String s1 = "harshit";
		System.out.println(s.compareTo(s1)); //Not ignoring upper case
		System.out.println(s.compareToIgnoreCase(s1)); //Ignoring case
		

	}

}
