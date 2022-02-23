package stringBufferDemo;

public class StringBufferDemo {
	public static void main(String []args) {
		StringBuffer s = new StringBuffer("Harshit");
		System.out.println(s.append("Dhiman"));
		System.out.println(s.capacity()); //16 + (16-23)
		
		//***************String Manipulation***************
		StringBuffer str =new StringBuffer(" Object class is an Umbrella class in java :)");
		System.out.println("equals method in java is present in object class and" + str);
		
		System.out.println("Length of str is " + str.length());
		String str2 = new String(str.toString());
		int pos = str.indexOf(" in java");
		System.out.println(str.insert(pos, " (Parent of all the classes) "));
	}

}
