package oops;
class Sem5{
    private int math,computer;
	
	public void input1() {
		 math=25;
	     computer=40;
	}
	public void output1() {
		System.out.println("marks in maths "+math);
		System.out.println("marks in science "+computer);
	    int total_marks=math +computer;
	    System.out.println(total_marks);
	}
}
class Sem4 extends Sem5 {
	private int c,cpp,java;
	public void input2() {
		c=54;
		cpp=90;
		java=99;
	}
	public void output2() {
		System.out.println("marks in c "+c);
		System.out.println("marks in cpp "+cpp);
		System.out.println("marks in java "+java);
		int total_marks2=c+cpp+java;

	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Sem4 obj = new Sem4();
		obj.input1();
		obj.input2();
		
		obj.output1();
		obj.output2();
	}

}
