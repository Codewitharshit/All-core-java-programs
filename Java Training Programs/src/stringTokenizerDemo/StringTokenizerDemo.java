package stringTokenizerDemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		System.out.println("Exercise1");
		StringTokenizer st = new StringTokenizer("Hello World How ARE you", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}

		System.out.println("Exercise 2");
		StringTokenizer st1 = new StringTokenizer("Hello:world:how:are:you", ":");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println("Exercise 3");
		StringTokenizer st2 = new StringTokenizer("Hello:world:how:are:you", ":", true);
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println("Exercise 4");
		StringTokenizer st3 = new StringTokenizer("Hello,world,how,are,you", ",", false);
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}

	}

}
