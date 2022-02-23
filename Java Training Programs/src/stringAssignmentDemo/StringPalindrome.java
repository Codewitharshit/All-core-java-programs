package stringAssignmentDemo;
// Palindrome in a string
public class StringPalindrome {

	public static void main(String[] args) {
		String s ="madam";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse + s.charAt(i);
			}
		System.out.println(reverse);
		if(s.equals(reverse)){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		

	}

}
