package Day_7_Advance_java;

public class Multithreading_4 implements Runnable{
	public void run()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Thread t5=new Thread(new Multithreading_4());
		t5.start();

	}

}
