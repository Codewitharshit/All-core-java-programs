package exceptionHandlingDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FourthLoopThruAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the ArrayElements");
		//for (int i = 0; i < size; i++) {
			//arr[i] = sc.nextInt();
		//}
		float sum = 0;
		float avg = 0;

		try {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				sum = sum + arr[i];
			}
			System.out.println("The sum of the array elements is " + sum);
			avg = sum / size;
			System.out.println("The average of the array elements is " + avg);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (InputMismatchException e) {
			System.out.println("inputmismatchexception occured" + e);
		}
	}
}