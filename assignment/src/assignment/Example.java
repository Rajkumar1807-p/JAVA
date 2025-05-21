package assignment;
interface f1
{
	void jet();
}
interface f2
{
	void fighter();
}
 interface  f3 extends f1,f2 
{
	void raptor(); 
}
public class Example implements f3
{
	public void jet()
	{
		System.out.println("su35");
	}
	public void fighter()
	{
		System.out.println("su57");
	}
	public void raptor ()
	{
		System.out.println("mirag");
	}
	public static void main(String[] args)
	{
		Example a=new Example();
		a.jet();
		a.fighter();
		a.raptor();
	
	}
}
