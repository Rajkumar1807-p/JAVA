package Day_7_Advance_java;
public class Demon extends Thread 
{
	String s;
	public Demon(String name)
	{
		s=name;
	}
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(s+" is Deamon Thread.");
		}
		else
		{
			System.out.println(s+" is user Thread.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demon d1=new Demon("thread1");
		Demon d2=new Demon("thread2");
		Demon d3=new Demon("thread3");
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.setDaemon(false);
		d3.start();
	}
}
