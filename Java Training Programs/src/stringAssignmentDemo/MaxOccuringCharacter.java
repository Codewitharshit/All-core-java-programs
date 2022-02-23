package stringAssignmentDemo;

public class MaxOccuringCharacter {

	public static void main(String[] args) {
		String s = "welcome in Edubridge family";
		s=s.toLowerCase();
		int arr[] = new int[127];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
		}
		int max = -1;
		char x = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (max < arr[s.charAt(i)]) {
				max = arr[s.charAt(i)];
				x = s.charAt(i);
			}
			
		}
		System.out.println(x+" is max occured with value of "+max);
		

	}

}
