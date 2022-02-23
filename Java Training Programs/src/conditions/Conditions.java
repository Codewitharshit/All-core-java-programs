package conditions;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=33) {
			System.out.println("You are pass");
		}
		else {
			System.out.println("You are fail");
		}

	}

}
