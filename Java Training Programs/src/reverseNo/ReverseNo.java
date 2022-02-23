package reverseNo;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		System.out.println("Reverse a number program");
		System.out.println("Enter a number to get reverse value");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int lastdigit,reverse=0;
		int n=value;
		while(n>0) {
			lastdigit=n%10;
			reverse=(reverse*10)+lastdigit;
			n=n/10;
		}
		System.out.println("The reversed value is "+reverse);
		

	}

}
