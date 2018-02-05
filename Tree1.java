package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class Tree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new  Mycomparator1());
		Employee1 e1=new Employee1(1,"sauru");
		Employee1 e2=new Employee1(3,"megha");
		Employee1 e3=new Employee1(2,"abc");
		t.add(e2);
		t.add(e3);
		t.add(e1);
		System.out.println(t);
		
		
		

	}

}

class Mycomparator1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee1 e1=(Employee1)obj1;
		Employee1 e2=(Employee1)obj2;
		String s1=e1.name;
		String s2=e2.name;
		
		
		
		return s1.compareTo(s2);
	}
}

class Employee1
{
	int id;
	String name;
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
	
}