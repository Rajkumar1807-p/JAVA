//By using final in method you cannot override.
package Day_6_oops;
class Test{
//	 final void show() {
//		System.out.println("Hi");
//	}
	 void show() {
		System.out.println("Hi");
	}
}
public class Final_in_method extends Test {
//	final int a=23;
	int a=23;
	void show() {
		System.out.println("Hello");
		System.out.println(a);
		a=52;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Final_in_method f=new Final_in_method();
		f.show();
	}
}
