package Day_7_Advance_java;

public class Throws_Exception_handling2 {
	static void add(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("maths raadhaa neeku");
		}
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			add(10,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Covered all the keywords");
		}
	}

}
