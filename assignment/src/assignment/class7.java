package assignment;

interface fridge
{
	void samsung();
}
interface cooler
{
	void kenstar();
}
interface Ac extends fridge,cooler
{
}
class fan 
{
	 void washingmachine()
	{
		System.out.println("super smart");
	}
}
class electronics extends fan implements Ac
{
	public void samsung()
	{
		System.out.println("super cool");
	}
	public void kenstar()
	{
		System.out.println("fast cooling");
	}
}
public class class7 
{
	public static void main (String[] args)
	{
		electronics f=new electronics();
		f.samsung();
		f.kenstar();
		f.washingmachine();
	}
}
