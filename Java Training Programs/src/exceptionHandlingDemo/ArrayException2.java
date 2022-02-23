package exceptionHandlingDemo;
//
import java.util.Scanner;

public class ArrayException2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to print");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the index number of the element you want to print");
		int idx = sc.nextInt();

		try {
			System.out.println("Your output is " + arr[idx]);
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}

}
