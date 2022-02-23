package userInput;

import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		System.out.println("Enter input");
		Scanner sc =new Scanner(System.in);
		int userin = sc.nextInt();
		System.out.println("Your input is "+userin);

	}

}
