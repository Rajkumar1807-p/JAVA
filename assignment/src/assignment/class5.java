package assignment;
interface raj
	{
	void name();
	}
class surname implements raj
{
	public void name()
	{
	System.out.println("pothunuri");
	}
}

interface sai 
	{
	void fullname();
	}
class fathername implements sai
{
	public void fullname()
	{	
	System.out.println("mandamarri");
	}
}
	interface kumar
	{
	void halfname();
	}
class ssss implements kumar
{
	public void halfname()
	{
	System.out.println("ramancolony");
	}
}
public class class5 
{
public static void main(String[] args)
	{
		surname n=new surname();
		fathername f=new fathername();
		ssss h=new ssss();
		n.name();
		f.fullname();
		h.halfname();
	}

}
