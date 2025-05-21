package Day_5_oops;
class Sample11{
	public Sample11() {
		System.out.println("good morning.");
	}
	int x=99;
	void print()
	{
		System.out.println("hello");
	}
}
public class Super_keyword_invoking_variables extends Sample11 {
	public Super_keyword_invoking_variables() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_keyword_invoking_variables s=new Super_keyword_invoking_variables();
		s.show();
	}

}
