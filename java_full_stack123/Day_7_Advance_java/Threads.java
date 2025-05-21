package Day_7_Advance_java;

public class Threads extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads t1=new Threads();
		Threads t2=new Threads();
		Threads t3=new Threads();
		Threads t4=new Threads();
		Threads t5=new Threads();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		System.out.println(t5.getName());
		System.out.println(t5.getState());
		Threads d1=new Threads();
		d1.start();
		System.out.println("hi");
		try {
		d1.sleep(20000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("hello");
		
	}

}
