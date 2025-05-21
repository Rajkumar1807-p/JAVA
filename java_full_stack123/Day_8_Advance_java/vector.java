package Day_8_Advance_java;

import java.util.Enumeration;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> l1=new Vector <Integer>();
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		System.out.println(l1);
		Enumeration<Integer> i1=l1.elements();
		while(i1.hasMoreElements())
		{
			System.out.println(i1.nextElement());
		}
	}
}
