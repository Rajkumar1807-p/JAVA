package Day_7_Advance_java;
import java.util.*;
public class Throws_exception_handling  {
	void add() throws ArithmeticException,InputMismatchException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a,b values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
		s.close();
		
	}
	public static void main(String[] args) // throws ArithmeticException,InputMismatchException
	{
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter a,b values");
//		int a=s.nextInt();
//		int b=s.nextInt();
//		int c=a/b;
//		System.out.println(c);
		Throws_exception_handling s=new Throws_exception_handling();
		try {
	        s.add();
	    } catch (ArithmeticException | InputMismatchException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}
}
