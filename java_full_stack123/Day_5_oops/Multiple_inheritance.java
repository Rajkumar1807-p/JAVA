package Day_5_oops;
class Fruits{
	void benifits()
	{
		System.out.println("healthy");
	}
}
class Apple extends Fruits
{
	void color()
	{
		System.out.println("red");
	}
}
class Mango extends Fruits
{
	void price()
	{
		System.out.println("100 per 1.5 kg");
	}
}
class Banana extends Fruits
{
	void taste()
	{
		System.out.println("sweet");
	}
}

public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		Mango m=new Mango();
		Banana b=new Banana();
		a.benifits();
		a.color();
		m.benifits();
		m.price();
		b.benifits();
		b.taste();
		

	}

}
