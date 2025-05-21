package Day_7_Advance_java;
class CheppanuException extends Exception{
	public CheppanuException(String message)
	{
		super(message);
	}
}
public class User_defined_exceptions {
	public static void age_check(int age) throws CheppanuException
	{
		if (age >18)
		{
			throw new CheppanuException("cheppanu poo");
		}
		else
		{
			System.out.println("nenu chinna pilladini");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			age_check(5);
		}
		catch(CheppanuException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("good morning");
		}

	}

}
