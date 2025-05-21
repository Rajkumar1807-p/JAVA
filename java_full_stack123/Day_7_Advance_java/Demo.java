package Day_7_Advance_java;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the class name:");
			String className=s.next();
			Class.forName(className);
			System.out.println("The class was not found.");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found:"+e.getMessage());
			
		}
	}
}