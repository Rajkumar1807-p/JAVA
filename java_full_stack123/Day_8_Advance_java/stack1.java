package Day_8_Advance_java;
import java.util.*;
public class stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> s1= new Stack<Integer>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		System.out.println(s1);
		Iterator<Integer> il=s1.iterator();
		System.out.println("Elements before modification");
		while(il.hasNext())
			System.out.print(il.next()+" ");
		s1.pop();
		Iterator<Integer> i2=s1.iterator();
		System.out.println("Elements after modification");
		while(i2.hasNext())
			System.out.print(i2.next()+" ");
		System.out.print("peek element is ");
		int a=s1.peek();
		System.out.println(a);
	}

}
