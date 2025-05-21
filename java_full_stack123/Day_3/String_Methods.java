package Day_3;

public class String_Methods 
{
	public static void main(String[] args)
	{
		//  if you want to represent any object as a string toString() method comes into existence.
		//  it returns the string representation of the object.
		//By overriding the toString() method of the object class,we can return values of the object,so we don't use hash code.
		
		String s1="prince";
		String s2="queen";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
