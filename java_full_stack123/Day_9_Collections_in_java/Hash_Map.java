package Day_9_Collections_in_java;

import java.util.*;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.clear();
		m1.put(1,"cse");
		m1.put(5,"ece");
		m1.put(3,"eee");
		m1.put(2,"mech");
		m1.put(6,"ds");
		m1.put(4,"aiml");
		m1.put(7, null);
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
		System.out.println(i.getValue());
		System.out.println(i.getKey());
		}
	}
}
