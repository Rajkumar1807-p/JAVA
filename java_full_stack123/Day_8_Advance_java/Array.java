package Day_8_Advance_java;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {1,2,3,4,5,6,4,3,29};
//		Arrays.sort(a);
//		for(int x:a)
//			System.out.println(x);
		int a[]= {1,2,3,4,5,6,4,3,29};
		Arrays.sort(a);
		int ar=Arrays.binarySearch(a,29);
		System.out.println(ar);
		for(int x:a)
			System.out.println(x);
		
	}
}
