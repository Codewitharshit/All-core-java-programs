package stringAssignmentDemo;

public class CharBeforeAfterDemo {

	public static void main(String[] args) {
		String s = "moon#night";
		char ch = '#';
		for (int i = 0; i < s.length(); i++) {

			if (ch == s.charAt(i)) {
				if (s.charAt(i - 1) == s.charAt(i + 1)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}
		}

	}

}
