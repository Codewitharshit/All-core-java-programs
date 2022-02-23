package exceptionHandlingDemo;
//Array index out of bounds exception
import java.util.Scanner;

public class arrayException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		int marks[] = new int[size];
		for (int i = 0; i < size; i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println("Enter the index number of the element you want to print");
		int idx = sc.nextInt();
        try {
        	System.out.println("The element at the given index"+idx+"is"+marks[idx]);
        }
        catch(Exception e){
        	System.out.println("ArrayException is thrown");
        }
//        System.out.println(marks[idx]);
       
	}

}
