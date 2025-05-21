package Day_8_Advance_java;
import java.util.*;
public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("Hi");
		l1.add(57);
		ArrayList<Object> l2=new ArrayList<Object>();
		l2.add(14);
		l2.add("Hi");
		l2.add(57);
		l1.addAll(l2);
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
