package Day_6_Advance_java;

public class Nested_inner_class {
	void show()
	{
		System.out.println("Hi");
	}
	class Test23{
		void print()
		{
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		Nested_inner_class n=new Nested_inner_class ();
		n.show();
		Nested_inner_class.Test23 t1=new Nested_inner_class().new Test23();
		t1.print();
	}
}
