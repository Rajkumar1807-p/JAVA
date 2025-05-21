//In java we have 5 functional interfaces:
//	--runnable
//  --
package Day_7_Advance_java;

class Multithreading implements Runnable {
	public void run()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) 
	{
		 Multithreading t1=new Multithreading();
		 Multithreading t2=new Multithreading();
		 Thread p1=new Thread(t1);
		 Thread p2=new Thread(t2);
		 System.out.println("hello");
		 p1.start();
		 p2.start();
		 System.out.println(p1.getName());

		 System.out.println(p2.getName());
	}
}
