package switchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int days;
		System.out.println("Enter week day");
		Scanner sc = new Scanner(System.in);
		days = sc.nextInt();
		switch(days){
			case 1 :
				System.out.println("Monday");
			break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("wednesday");
				break;
			case 4:
				System.out.println("thursday");
				break;
			case 5:
				System.out.println("friday");
				break;
			case 6:
				System.out.println("saturday");
				break;
			case 7:
				System.out.println("sunday");
				break;
			default:
				System.out.println("Wrong input");
				
				
		}

	}

}
