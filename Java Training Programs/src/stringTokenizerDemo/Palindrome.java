package stringTokenizerDemo;
//Wap to check string is palindrome or not like “madam”
public class Palindrome {

	public static void main(String[] args) {
		String s =new String("madam");
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
		if(s.equals(reverse)) {
			System.out.println("Palindrome");
		}
		
		else {
			System.out.println("Not a palindrome");
		}

	}

}
