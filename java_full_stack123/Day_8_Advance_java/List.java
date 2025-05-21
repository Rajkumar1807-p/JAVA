package Day_8_Advance_java;
import java.util.*;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(20);
		l1.add(45);
		System.out.println(l1);
		ListIterator<Integer> i1=l1.listIterator();
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
		while(i1.hasPrevious()) 
		{
			System.out.println(i1.previous());
		}
	}
}
