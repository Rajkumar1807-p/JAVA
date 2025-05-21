package Day_4_oops;

public class Copied_constructor {
	int x;
	int y;
	public Copied_constructor(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Copied_constructor(Copied_constructor c1)
	{
		this.x=c1.x;
		this.y=c1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copied_constructor c1=new Copied_constructor(100,22);
		Copied_constructor c2=new Copied_constructor(c1);
	}

}
