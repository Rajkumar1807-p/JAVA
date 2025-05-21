package Day_8_Advance_java;

import java.util.*;
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(10);
		q1.add(20);
		q1.offer(45);
		q1.offer(40);
		q1.offer(40);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
	}
}
