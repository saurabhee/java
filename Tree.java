package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet t=new TreeSet(new Mycomparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(3);
		t.add(25);
		
		System.out.println(t);
		
		
		
		
		
		
	}

}
class Mycomparator implements Comparator
{
	public int compare(Object obj1,Object obj2)

	{
          Integer i1=(Integer)obj1;
          Integer i2=(Integer)obj2;
          
//          if (i1<i2)
//        	  return +1;
//          else if (i1>i2)
//        	  return -1;
//          else
//        	  return 0;
//          
         // return i1.compareTo(i2);
         // return i2.compareTo(i1);
         // return -i1.compareTo(i2);
        // return -i2.compareTo(i1);
         // return +1;
         // return -1;
          return 0;
		
		
	}
}