package Day_4_oops;

public class Test 
{	int a;
	int b;
	public Test(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add()
	{
		System.out.println(this.a-this.b);
	}
	public static void main(String[] ags)
	{
		Test t=new Test(78,34);
		t.add();
		
	}

}
