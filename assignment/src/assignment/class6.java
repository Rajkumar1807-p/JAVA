package assignment;
interface royal
{
	void family();
}
class poor 
{
	void joint()
	{
		System.out.println("very happy");
	}
}
class Middle extends poor implements royal
{
	 public  void family()
	{
		System.out.println("vvvv good");
	}
	void superjoint()
	{
		System.out.println("happy");
	}
}
class rich 
{
	void profit()
	{
		System.out.println("mad");
	}
}
class business  extends rich
{
	void loss()
	{
		System.out.println("full");
	}
}
public class class6 {
	public static void main(String[] args)
	{
		
		Middle m=new Middle();
		business b=new business();
		m.family();
		m.joint();
		m.superjoint();
		b.profit();
		b.loss();
	}
}
