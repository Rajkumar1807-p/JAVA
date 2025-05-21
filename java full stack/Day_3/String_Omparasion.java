package Day_3;

public class String_Omparasion {
	public static void main(String[] args)
	{
		String s1="Sai";
		String s2="Sai";
		String s3=new String("Sai");
		String s4=new String("Sai");

		System.out.println(s1.equals(s2));   //true:   it compares original content of both strings
		System.out.println(s1==s2);          //true:   it compares whether both string point to the same memory.
		System.out.println(s3.equals(s4));   //true:   it compares original content of both strings
		System.out.println(s3==s4);          //false:  it points to two different locations in the string constant pool
		System.out.println(s1==s4);          //false:  it points to two different locations in the string constant pool
		System.out.println(s1.equals(s4));   //true:   it compares original content of both strings.
		
		String s5=new String("SaiKumar");
		String s6=new String("RajKumar");
		System.out.println(s1.compareTo(s2));  //return 0:  since complete case sensitive and same.
		System.out.println(s3.compareTo(s4));  //return 0:  since complete case sensitive and same.
		System.out.println(s5.compareTo(s6));  //return 1:  S>R so positive
		System.out.println(s6.compareTo(s5));  //return -1: S<R so negative
	}

}
