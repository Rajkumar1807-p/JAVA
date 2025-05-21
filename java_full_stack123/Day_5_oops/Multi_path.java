package Day_5_oops;
class Fruits1{
	void benifits()
	{
		System.out.println("healthy");
	}
}
class Apple1 extends Fruits1
{
	void color()
	{
		System.out.println("red");
	}
}
class Mango1 extends Fruits1
{
	void price()
	{
		System.out.println("100 per 1.5 kg");
	}
}
class Banana1 extends Fruits1
{
	void taste()
	{
		System.out.println("sweet");
	}
}
public class Multi_path 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Apple1 a=new Apple1();
		Mango1 m=new Mango1();
		Banana1 b=new Banana1();
		a.benifits();
		a.color();
		m.benifits();
		m.price();
		b.benifits();
		b.taste();
	}
}
