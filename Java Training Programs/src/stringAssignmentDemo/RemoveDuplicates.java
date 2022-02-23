package stringAssignmentDemo;
//WAP to Remove dublicate words in a given string.
public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "Welcome to Welcome to home";
		s=s.toLowerCase();
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int k = i + 1; k < str.length; k++) {
				if (str[i].equals(str[k])) {
                     str[k]="repeated";
				}
			}

		}
		String updated ="";
		for(int i=0;i<str.length;i++) {
			if(str[i]!="repeated") {
				updated=updated+ str[i]+" ";
			}
		}
		System.out.println(updated);

	}
}
