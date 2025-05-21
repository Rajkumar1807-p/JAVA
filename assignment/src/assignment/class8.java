package assignment;
interface car
{
	void bmw();
}
interface bike
{
	void honda();
}
interface truck
{
	void tata();
}
interface vehicles extends car,bike,truck
{
	
}
class transport implements vehicles
{
	public void bike()
	{
		System.out.println("super fast");
	}
	public void car()
	{
		System.out.println(" fast");
	}
	public void truck()
	{
		System.out.println("superslow");
	}
}
public class class8 {
	public static void main(String[] args)
	{
		transport n=new transport();
		n.bike();
		n.car();
		n.truck();
	}
}
