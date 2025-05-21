package day_7;
import java.util.Scanner;
public class Try_catch 
{
	public static void main(String[] args) throws ArithmeticException
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
		catch (ArithmeticException|InputMismatchException e)
			System.out.println(e.getMessage());
		}
	}
