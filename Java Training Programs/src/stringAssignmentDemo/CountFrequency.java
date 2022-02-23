package stringAssignmentDemo;
// Write a Java program to print the frequency of each character in a string

public class CountFrequency {

	public static void main(String[] args) {
		String s = "Hello world how are you";
		s = s.toLowerCase();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int counter = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					counter++;
				}
				
				
			}
			if (counter != 0) {
				System.out.println(ch + "'s frequency is" + counter);
			}

		}

	}

}
