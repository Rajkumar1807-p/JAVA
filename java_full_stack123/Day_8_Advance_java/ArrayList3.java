package Day_8_Advance_java;

import java.util.*;

public class ArrayList3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		java.util.List<Object> l1=new ArrayList<>();
		l1.add(12);
		l1.add("45");
		l1.add(5.7);
		l1.add(2,"Hello");
		System.out.println(l1);
		//ArrayList<Integer> extra=Arrays.asList("Nikky","Bharath");
		//l1.addAll(extra);
		System.out.println(l1);
	}

}
//output:
//	[12, Hi, Hello, 57]
//	[12, Hi, Hello, 57, Nikky, Bharath]


//import java.util.*;
//
//class Main 
//{
//	public static void main(String[] args) 
//	{
//		// TODO Auto-generated method stub
//		List<Object> l1=new ArrayList<>();
//		l1.add(12);
//		l1.add("Hi");
//		l1.add(57);
//		l1.add(2,"Hello");
//		System.out.println(l1);
//		List<Object> extra=Arrays.asList("Nikky","Bharath");
//		l1.addAll(2,extra);
//		System.out.println(l1);
//	}
//}
//output:
//	[12, Hi, Hello, 57]
//	[12, Hi, Nikky, Bharath, Hello, 57]