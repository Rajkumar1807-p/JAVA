package Day_9_Collections_in_java;

import java.util.*;
public class Linked_hash_set 
{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Set<Integer> q1=new LinkedHashSet<Integer>();
			q1.add(12);
			q1.add(89);
			q1.add(null);
			q1.add(89);
			q1.add(null);
			System.out.println(q1);
		}
}
