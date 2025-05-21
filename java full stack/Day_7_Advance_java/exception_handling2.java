//finally is a block which would execute if error may or may not occur
//exception handling can be done in two ways:
//	--try catch
//	--throws

//try catch  can be used in unchecked exceptions
//throws can be used in checked exception

package Day_7_Advance_java;
import java.util.*;
public class exception_handling2 
{
	public static void main(String[] args) throws ArithmeticException
	{
		System.out.println("Enter a,b values");
		Scanner s=new Scanner(System.in);
		try 
		{
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(InputMismatchException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(ArithmeticException | InputMismatchException e)
//		{
//			System.out.println(e.getMessage());
//		}
		finally
		{
			System.out.println("Hi");
		}
		s.close();
	}
}
