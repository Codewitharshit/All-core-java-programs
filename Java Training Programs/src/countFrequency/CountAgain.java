package countFrequency;

import java.util.Scanner;

public class CountAgain {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc= new Scanner(System.in);
		String x = sc.nextLine();
		x=x.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			int counter=0;
			for(int i=0;i<x.length();i++) {
				if(ch==x.charAt(i))
					counter++;
			}
			if(counter!=0) {
				System.out.println(ch+"'s frequency is "+counter);
			}
		}
		

	}

}
