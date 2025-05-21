package Day_3_oops;

abstract class arithmetic{
	abstract void add();
	abstract void sub();
	void mul() {
		System.out.println(4*2);
	}
	static void div() {
		System.out.println(4/2);
	}
	static void mod() {
		System.out.println(4%2);
	}
	
}
class Sample extends arithmetic {
	public void add() {
		System.out.println(4+2);
	}
	public void sub() {
		System.out.println(4-2);
	}
}

public class Abstraction_1 extends Sample {
	void show() 
	{
		System.out.println("**");
	}
	
	public static void main(String[] args)
	{
		Sample a=new Sample();
		a.add();
		a.sub();
		a.mul();
		Sample.div();
		Sample.mod();
		Abstraction_1 o=new Abstraction_1();
		o.show();
	}

}
