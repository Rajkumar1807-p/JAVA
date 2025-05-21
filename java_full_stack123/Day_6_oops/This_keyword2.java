package Day_6_oops;

class name{
	void add() {
		System.out.println("Saikumar");
	}
	
}
public class This_keyword2 extends name {
	int a=69;
	void add()
	{
		int a=69;
		System.out.println(a);
	}
	void sub()
	{
		System.out.println(a);
		this.add();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_keyword2 t=new This_keyword2();
		t.add();
		t.sub();
	}
}
