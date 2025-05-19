package assignment;
interface varient
{
	void maza();
}
class Cool
{
	void type ()
	{
		System.out.println(" type : soft drink");
	}
}
class Store extends Cool implements varient
{
	public void varient()
	{
		System.out.println(" name :sprite");
	}
	void brand ()
	{
		System.out.println("company :coca cola");
	}
}
class Company extends Store 
{
	void Factory()
	{
		System.out.println(" Brand:dont know");
	}
}
public class Drinks {
	public  static void main(String[] args)
	{
		Company c=new Company();
		c.Factory();
		c.brand();
		c.type();
		c.varient();
		
	}

}
