package exceptionHandlingDemo;
//Square of a number
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandling {

	public static void main(String[] args) {
			InputStreamReader isr =new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Input");
			try {
				int num =Integer.parseInt(br.readLine());
				System.out.println("The square of the number is "+num*num);
				
			}
			catch(Exception e){
				System.out.println("Entered input is not a valid format for an integer.");
				
			}
			
	}

	
	}


