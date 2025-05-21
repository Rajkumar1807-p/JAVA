package Day_5_oops;

public class Maain_mothod_can_not_be_overridden {
	public static void main(int a,int b)
	{
		System.out.println("Good Morning");
	}
//	public static void main(int a,int b)
	public static void main(int a)
	{
		System.out.println("Good Afternoon");
	}
	public static void main(String[] args) 
	{
		Maain_mothod_can_not_be_overridden.main(12,23);
//		Maain_mothod_can_not_be_overridden.main(52,45);
		Maain_mothod_can_not_be_overridden.main(12);
	}

}
//
