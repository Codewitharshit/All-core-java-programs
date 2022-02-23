package operators;

public class Operators {

	public static void main(String[] args) {
		//******Arithmetic operators**********
		
		System.out.println("Value of 10%13 is "+ (10%13));
		System.out.println("Value of 4%3 is "+(4%3));
		System.out.println("Value of 5%10 is "+(5%10));
		
       //*******Wrapper classes**********
		
		/*int a =9;
		Integer store = new Integer(a); //boxing
		Integer save =a; //Autoboxing
		
		int b=save.intValue();//Unboxing
		*/
		
		int a=10;
		int b=11;
		System.out.println("value of ++a " + ++a);
		System.out.println("Value of --b " + --b);
		
		//********Relational operator*********
		int x =10;
		int y =20;
		System.out.println("a==b "+ (a==b));
		System.out.println("x<=y "+ (x<=y));
		System.out.println("a!=b " +(a!=b));
		
		//*********Logical operator***********
		
         System.out.println((a>b) && (x<y));
         System.out.println((a<b)||(x<y)) ;
         System.out.println(!((a<b)||(x<y)));
         
         //**********Assignment operator**********
         a=b;
         a=a+b;
         System.out.println(b);
         System.out.println(a);
         x+=2;
         x*=2;
         System.out.println(x);
         
         //******Ternary operator********
         // c=a>b?a:b;
         
         //*******Bitwise operator******
         // java's bitwise operator is used to operate on individual bits of integer.
         
         
         
         
         
		
		
		
		
	}

}
