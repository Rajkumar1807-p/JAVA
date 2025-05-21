package Day_7_Advance_java;
class Test11 extends Thread
{
	public void run()
	{
		System.out.println("Test1 extends Thread");
	}
}
class Test22 extends Test11
{
	public void run()
	{
		System.out.println("Test2 extends Test1" );
	}
}
class Test3 implements Runnable
{
	public void run()
	{
		System.out.println("Test3 implements Runnable");
	}
}
class Test4 extends Test3
{
	public void run()
	{
		System.out.println("test4 extends Test3");
	}
}
public class Assignment_multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test11 t1=new Test11();
		t1.start();
		Test22 t2=new Test22();
		t2.start();
		Test3 t3 =new Test3();
		Thread p1=new Thread(t3);
		p1.start();
		Test4 t4=new Test4();
		Thread p2=new Thread(t4);
		p2.start();
	}
}
