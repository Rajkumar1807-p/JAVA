package Day_3_oops;
abstract class Show{
	abstract void show1();
	void show2() {
		System.out.println("show 2");
	}
	void show3() {
		System.out.println("show 3");
	}
	static void show4() {
		System.out.println("show 4");
	}
	static void show5() {
		System.out.println("show 5");
	}
	abstract void show6();
}
class Base extends Show{
	public void show1() {
		System.out.println("show 1");
		
	}
	public void show6() {
	 System.out.println("show 6");
	
	}
	void show7() {
		System.out.println("show 7");
	}
}

public class Abstract_2 {
	public static void main(String[] args)
	{
		Base b=new Base();
		b.show1();
		b.show2();
		b.show3();
		Base.show4();
		Base.show5();
		b.show6();
		b.show7();
		
		
	}
}
