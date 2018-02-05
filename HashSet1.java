

package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> h=new HashSet<>();
		LinkedHashSet l=new LinkedHashSet();
		Employee e1=new Employee(2," niki");
		Employee e2=new Employee(3,"megha");
		Employee e3=new Employee(4,"durga");
		Employee e4=new Employee(5,"durga");
		Employee e5=new Employee(6,"abc");
		
		
		
		h.add(new Employee(1,"sauru"));
		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);
		
		//h.clear();
		//System.out.println(h.clone());
		System.out.println(h);
		System.out.println(h.contains(e3));
		System.out.println(h.containsAll(h));
		System.out.println(h.hashCode());
		System.out.println(h.isEmpty());
		System.out.println(h.remove(e5));
		System.out.println(h.size());
		System.out.println(h.toArray());
		System.out.println(h.retainAll(h));
		
		

	}

}
 class Employee
 {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
 }