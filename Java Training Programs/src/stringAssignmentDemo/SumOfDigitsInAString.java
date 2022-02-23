package stringAssignmentDemo;

//Write a Java program to calculate the sum of the numbers appear in a given string

public class SumOfDigitsInAString {

	public static void main(String[] args) {
		String s = "1to20harshit3" ;
		int sum = 0;
		String num = "0";
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (Character.isDigit(x)) {
				num = num + x;
			} else {
				sum = sum + Integer.parseInt(num);
				num = "0";
			}
			
			
		}
		if (num != null) {
			sum = sum + Integer.parseInt(num);
		}

		System.out.println("The sum of digits in a string is "+sum);

	}

}
