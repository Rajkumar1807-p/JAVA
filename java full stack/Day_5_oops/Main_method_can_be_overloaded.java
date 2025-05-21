package Day_5_oops;
public class Main_method_can_be_overloaded 
{
	public static void main()
	{
		System.out.println("Good Morning");
	}
	public static void main(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(double d1,double d2 )
	{
		System.out.println(d1-d2);
	}
	public static void main(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	public static void main(String[] args) 
	{
		Main_method_can_be_overloaded.main();
		Main_method_can_be_overloaded.main(12,22);
		Main_method_can_be_overloaded.main(38.7,54.3);
		Main_method_can_be_overloaded.main("sai ","kumar");
	}
}