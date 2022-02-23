package stringJoinersDemo;

import java.util.StringJoiner;

public class StringJoinersDemo {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("+","[","]");
		sj.add("My");
		sj.add("name");
		sj.add("is");
		sj.add("Harshit");
		System.out.println(sj);
		StringJoiner sj2 = new StringJoiner(",","#","#");
		sj2.add("My");
		sj2.add("Name");
		sj2.add("is");
		sj2.add("Harshit");
		System.out.println(sj2);
		StringJoiner merge = sj.merge(sj2);
		System.out.println(merge);
	}

}
