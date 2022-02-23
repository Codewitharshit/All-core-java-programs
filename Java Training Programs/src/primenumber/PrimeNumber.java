package primenumber;

public class PrimeNumber {

	public static void main(String[] args) {
		int i,n=7;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Not a prime number");
				break;
			}
		}
		if(i==n) {
			System.out.println("It is a prime number");
		}

	}

}
