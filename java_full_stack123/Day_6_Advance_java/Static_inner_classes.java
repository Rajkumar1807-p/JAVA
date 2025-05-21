package Day_6_Advance_java;
class Sample
{
	static void show()
	{
		System.out.println("Hi");
	}
	static class Test
	{
		static void print()
		{
			System.out.println("Hello");
			show();
		}
	}
}
public class Static_inner_classes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample.Test.print();
	}

}
