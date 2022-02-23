package stringAssignmentDemo;

/*
         Write a Java program to count how many times the substring 'life' present at
         anywhere in a given string.
*/
public class SubstringLife {

	public static void main(String[] args) {
		String s = "liveonwildlifelife";
		String subs = "life";
		int count=0;
		int x = s.length();
		int y = subs.length();
		for (int i = 0; i <= x - y; i++) {
			int j;
			for (j = 0; j < y; j++) {
				if (s.charAt(i + j) != subs.charAt(j)) {
                     break;
				}
			}
			if(j==y) {
				count++;
				
			}
			

		}
		System.out.println("The number of time life is appeared =  "+count );
	}

}
