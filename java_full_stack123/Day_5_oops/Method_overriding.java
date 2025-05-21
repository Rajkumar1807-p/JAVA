//rum time polymorphism is called as method overriding

package Day_5_oops;

class Test {
	void add(int a,int b)
	{
		System.out.println("Good Morning");
	}
}
public class Method_overriding extends Test{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		Method_overriding m=new Method_overriding();
		m.add(42,35);
		m.add(12,23);
	}
}
