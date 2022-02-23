package oops;

class Sem1 {
	private int math, computer;

	public void input1() {
		math = 25;
		computer = 40;
	}

	public void output1() {
		System.out.println("marks in maths" + math);
		System.out.println("marks in science" + computer);
		int total_marks = math + computer;
		System.out.println("total marks "+total_marks);
	}
}

class Sem2 extends Sem1 {
	private int c, cpp, java;

	public void input2() {
		c = 54;
		cpp = 90;
		java = 99;
	}

	public void output2() {
		System.out.println("marks in c" + c);
		System.out.println("marks in cpp " + cpp);
		System.out.println("marks in java " + java);
		int total_marks2 = c + cpp + java;
        System.out.println("total marks "+total_marks2);
	}
}
class Sem3 extends Sem2 {
	private int oops, dbms, os;

	public void input3() {
		oops = 54;
		dbms = 90;
		os = 99;
	}

	public void output3() {
		System.out.println("marks in oops " + oops);
		System.out.println("marks in dbms " + dbms);
		System.out.println("marks in os " + os);
		int total_marks3 = oops + dbms+ os;
		System.out.println("total marks"+total_marks3);

	}
}

public class MultiLevelInheritence {

	public static void main(String[] args) {
		Sem3 obj = new Sem3();
		obj.input1();
		obj.input2();
		obj.input3();
		
		obj.output1();
		obj.output2();
		obj.output3();
	}

}
