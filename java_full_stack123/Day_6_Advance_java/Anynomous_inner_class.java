package Day_6_Advance_java;
class Demo1{
	void show()
	{
		System.out.println("Hi");
	}
}
public class Anynomous_inner_class {
	Demo1 d=new Demo1() {
		void show()
		{
			System.out.println("Hello");
			super.show();
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anynomous_inner_class s=new Anynomous_inner_class();
		s.d.show();
	}
}
