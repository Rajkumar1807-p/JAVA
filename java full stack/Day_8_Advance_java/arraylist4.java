package Day_8_Advance_java;

import java.util.*;
public class arraylist4 
{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			java.util.List<Object> l1=new ArrayList<>();
			l1.add(12);
			l1.add(78);
			l1.add(57);
			l1.add(2,"Hello");
			System.out.println(l1);
			java.util.List<String> extra=Arrays.asList("Nikky","Bharath");
			l1.addAll(extra);
			System.out.println(l1);
		}
}
