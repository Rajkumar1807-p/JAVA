package Day_11;

public class types_of_methods {
	int a=10,b=20;
	static int p=20,q=30;
	void add() 
	{
		int y=1,z=2;
		System.out.println(a+b);
		System.out.println(p+q);
		System.out.println(y+z);
		//instance method allows static,instance,local variables
	}
	static void add1()
	{
		int y=1,z=2;
		System.out.println(p+q);
		System.out.println(y+z);
		//static methods allows static and local variables
		//but not instance variables
	}
	public static void main(String[] args)
	{
		types_of_methods t1=new types_of_methods();
		t1.add();
		types_of_methods.add1();
	}
}
