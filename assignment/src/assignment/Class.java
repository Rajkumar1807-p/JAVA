package assignment;
interface college
{
	void ece();
}
interface nrcm
{
	void branch();
}
class year 
{
	void sem()
	{
		System.out.println("3 year 2 sem");
	}
}
class Faculty  extends year  implements college,nrcm
{
	public void ece()
	{
	System.out.println("b.tech");
	}
	public void branch()
	{
		System.out.println("electronics and communication engineering");
	}
	
}
class student extends Faculty 
{
	public void friends()
	{
		System.out.println("no friends");
	}
}
public class Class {
	public static void main(String[] args)
	{
		student S=new student();
		S.ece();
		S.branch();
		S.sem();
		S.friends();
		
	}

}
