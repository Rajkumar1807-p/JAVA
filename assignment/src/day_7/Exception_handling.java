package day_7;
import java.util.*;
public class Exception_handling {
	public static void main(String[] args)
	{
		
		System.out.println("enter a,b values");
		Scanner s=new Scanner (System.in);
		try 
		{
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
			}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("hi");
		}
	}
}
// one try block and two catch block
// we can write multiple catch blocks in one by using (|) pipe symbol like
// catch(ArithmeticException|InputMismatchException e)
//{
//System.out.println(e.getMessage());
//}
// try catch can work in unchecked and throws will work in checked 