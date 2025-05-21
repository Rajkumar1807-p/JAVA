package assignment;
interface mrec
{
	void management();
}
interface mrits
{
	void conviner();
}
interface mrcet
{
	void mba();
}
class Colleges implements mrec,mrits,mrcet
{
	public void management()
	{
		System.out.println("expensive");
	}
	public void conviner()
	{
		System.out.println(" very expensive");
	}
	public void mba()
	{
		System.out.println(" less expensive");
	}
}
interface spec
{
	void ecet();
}
class Fees extends Colleges implements spec
{
	 public void ecet()
	{
		System.out.println("not bad");
	}
}

public class Class4 {
	public static void main(String[] args)
	{
		Fees m=new Fees();
		m.management();
		m.conviner();
		m.mba();
		m.ecet();
	}
}
