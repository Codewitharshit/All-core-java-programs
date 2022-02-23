package stringBuiderDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("StringBuilder is not Thread safe");
		System.out.println(sb);
		System.out.println(sb.append(" While StringBuffer is Thread safe"));

	}

}
