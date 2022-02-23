package CollectionAssignment;

import java.util.*;

class Employee {
	int id;
	String name;
	String address;
	Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
        this.id=id;
        this.name=name;
        this.address=address;
        this.salary=salary;
        
	}
	
	public int getId() {
		return id;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
       

public class Question5 {

	public static void main(String[] args) {
	

		List ls = new ArrayList();

		ls.add(new Employee(101, "Harshit", "Panchkula", 40000.10));
		ls.add(new Employee(102, "Harsh", "Delhi", 45000.10));
		ls.add(new Employee(103, "Jack", "USA", 50000.10));
		ls.add(new Employee(104, "Zayn", "UAE", 70000.10));
		
		Iterator it = ls.iterator();
		int checkId=101;
		while(it.hasNext()) {
			Employee obj = (Employee) it.next();
		if(obj.getId()==checkId) {
			System.out.println(obj);
		}
		}

	}

}
