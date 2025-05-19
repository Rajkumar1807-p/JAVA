package assignment;
interface name
{
	void model();
}
interface apple extends name
{
	void price();
}
class  Nokia implements apple
{
	public void model()
	{
		System.out.println("x4pro");
	}
	public void price()
	{
		System.out.println(20000);
	}
}
class motorola  implements apple
{
	public void model()
	{
		System.out.println("edge50");
	}
	public void price()
	{
		System.out.println(40000);
	}
}
public class Mobile {
public static void main(String[] args)
{
	
	Nokia m=new Nokia();
	motorola r=new motorola();
	
	
	
	m.model();
	m.price();
	r.model();
	r.price();
	
}
}