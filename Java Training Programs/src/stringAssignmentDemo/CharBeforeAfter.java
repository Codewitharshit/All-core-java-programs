package stringAssignmentDemo;

/*
      Write a Java program to check whether the character immediately before and
      after a specified character is same in a given string.
*/
public class CharBeforeAfter {

	public static void main(String[] args) {
		String s = "#moon#night";
		int ch=s.lastIndexOf("#");
	if (s.charAt(ch - 1) == s.charAt(ch + 1)) {
					System.out.println("True");
				}
				else {
					System.out.println("False");
				}
			
	}
}

