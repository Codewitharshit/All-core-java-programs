package stringAssignmentDemo;
//Write a Java program to count the number of words ending in 'm' or 'n' 
public class WordsEnding {

	public static void main(String[] args) {
		String s ="mam is in the room";
		String str[] = s.split(" ");
		int count =0;
		for(int i=0;i<str.length;i++) {
			
			String x = str[i];
		
			if(x.endsWith("m") || x.endsWith("n")){
				count++;
				
			}
			
			
		}
		System.out.println(" The number of words ends with m or n are "+count);
		
		
		
		
	}

}
