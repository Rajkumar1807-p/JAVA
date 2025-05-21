package Day_7_Advance_java;

public class Multithreading3 extends Thread {
	public void run() {
		for (int i=0;i<=10;i++){
			System.out.println(i);
			if (i==5)
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
		}
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Multithreading3 t1=new Multithreading3();
		for (int i=0;i<=10;i++)
			System.out.println(i);
		t1.start();
	}
}
