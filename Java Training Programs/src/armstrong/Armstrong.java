package armstrong;

public class Armstrong {

	public static void main(String[] args) {
		int n=153,remainder,result=0,
		originaln=n;
		int length=0;
		while(n>0) {
			length++;
			n=n/10;
			
		}
		n=originaln;
		while(n>0){
			remainder=n%10;
			result=(int) (result + Math.pow(remainder,length));
			n=n/10;
			}
		if(result==originaln) {
			System.out.println(originaln +": It is an armstrong number");
		}
		else {
			System.out.println(originaln +": It is not an armstrong number");
		}
	}
}
