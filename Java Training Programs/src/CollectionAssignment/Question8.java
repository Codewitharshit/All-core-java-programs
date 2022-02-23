package CollectionAssignment;
import java.util.*;

class Employee1 {
	int id;
	String name;
	String address;
	Double salary;
	
	public Employee1(int id, String name, String address, Double salary) {
        this.id=id;
        this.name=name;
        this.address=address;
        this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
public class Question8 {

	public static void main(String[] args) {
		Employee obj;

		List ls = new Vector();

		ls.add(new Employee1(101, "Harshit", "Panchkula", 40000.10));
		ls.add(new Employee1(102, "Harsh", "Delhi", 45000.10));
		ls.add(new Employee1(103, "Jack", "USA", 50000.10));
		ls.add(new Employee1(104, "Zayn", "UAE", 70000.10));
		
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			 System.out.println(it.next()); 
		}
	}

}
