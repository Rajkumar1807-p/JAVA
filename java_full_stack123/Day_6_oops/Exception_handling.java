//Errors are of two types:
//	-Compile time errors (Syntax errors)
//	--Run time errors (Exceptions)--- they can be handled.---it can handle the execution control of the program
//   Exception is a unwanted or unexpected event,which occurs during the execution of a program,i.e., at run time ,that disrupts 
//   the normal flow of the program's instructions.Exceptions can be caught and handled by the program.

//
package Day_6_oops;

public class Exception_handling {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Hi");
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

	}

}


//output:
//Hi
//java.lang.ArithmeticException: / by zero
//Hello
//Hello
//Hello
//Hello