package exceptionHandlingDemo;

import java.util.Scanner;

class MathOperation extends Exception {
	MathOperation(String msg) {
		super(msg);

	}
}

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of first student");
			String name1 = sc.nextLine();
			System.out.println("Enter the name of second student");
			String name2 = sc.nextLine();
			System.out.println("Enter the number of subjects");
			int numsubjects = sc.nextInt();
			System.out.println("Enter the marks of student name1 ");
			int firstsmarks[] = new int[numsubjects];
			for (int i = 0; i < numsubjects; i++) {
				firstsmarks[i] = sc.nextInt();
			}
			System.out.println("Enter the marks of student name2 ");
			int secondsmarks[] = new int[numsubjects];
			int i;
			for (i = 0; i < numsubjects; i++) {
				secondsmarks[i] = sc.nextInt();

			}
			try {
				if (firstsmarks[i] < 0 && firstsmarks[i] > 100) {
					if (secondsmarks[i] < 0 && secondsmarks[i] > 100) {
						throw new MathOperation("marks out of bound");
					}
				}
			} catch (MathOperation f) {
				System.out.println(f);
			}
			float avg1 = 0;
			int sum1 = 0;
			for (i = 0; i < firstsmarks.length; i++) {
				sum1 = sum1 + firstsmarks[i];
			}
			avg1 = sum1 / numsubjects;
			System.out.println("Average marks of student one is " + avg1);

			float avg2 = 0;
			int sum2 = 0;
			for (i = 0; i < firstsmarks.length; i++) {
				sum1 = sum1 + firstsmarks[i];
			}
			avg1 = sum2 / numsubjects;
			System.out.println("Average marks of student one is " + avg2);

		} catch (Exception e) {
			System.out.println("NumberFormatException");
		}

	}

}
