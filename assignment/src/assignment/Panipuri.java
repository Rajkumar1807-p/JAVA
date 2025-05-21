package assignment;
interface goal
{
	void shop();
}
interface gape
{
	void store();
}
class vada 
{
	void baji()
	{
		System.out.println("not good for health");
	}
}
class Fast  extends vada  implements goal,gape
{
	public void shop()
	{
	System.out.println("super");
	}
	public void store ()
	{
		System.out.println("pani");
	}
	
}
public class Panipuri 
{
	public static void main(String[] args)
	{
		Fast f=new Fast();
		f.shop();
		f.store();
		f.baji();
	}
}
