package countFrequency;

import java.util.Scanner;

public class CountFrequency {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		str =str.toLowerCase();
		for(char ch='a';ch<='z';ch++) {
			int counter = 0;
			for(int i=0;i<str.length();i++) {
				if(ch==str.charAt(i)) {
					counter++;
					
				}
			}
			if(counter>0) {
				System.out.println(ch+"'s frequency is "+counter);
			}
		}
		
	}

}
