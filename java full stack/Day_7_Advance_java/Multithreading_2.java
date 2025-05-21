package Day_7_Advance_java;
class Test1 extends Thread
{
	public void run() {
		System.out.println("Hi");
	}
}
//class Test2 extends Thread
//{
//	public void run() {
//		System.out.println("Hello");
//	}
//}
class Test2 implements Runnable
{
	public void run() {
		System.out.println("Hello");
	}
}
public class Multithreading_2 {

	public static void main(String[] args) {
		
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		t1.start();
		Thread p1=new Thread(t2);
		p1.start();
	}
}
