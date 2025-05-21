//once final is used we cannot able to reuse,reassign,override,inherit.

package Day_6_oops;

public class Final {
//	void show() {
//		final int a=23;
//		System.out.println(a);
//		a=34;
//		System.out.println(a);
//	}
	void show() {
		int a=43;
		System.out.println(a);
		a=45;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Final f=new Final();
		f.show();
	}
}
