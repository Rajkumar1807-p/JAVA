package Day_5_oops;
class Fruit{
	void benifits()
	{
		System.out.println("healthy");
	}
}
class Applee extends Fruit
{
	void color()
	{
		System.out.println("red");
	}
}
class Mangoo extends Fruit
{
	void price()
	{
		System.out.println("100 per 1.5 kg");
	}
}
class Bananaa extends Fruit
{
	void taste()
	{
		System.out.println("sweet");
	}
}

public class Multi_level_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Applee a=new Applee();
		Mangoo m=new Mangoo();
		Bananaa b=new Bananaa();
		a.benifits();
		a.color();
		m.benifits();
		m.price();
		b.benifits();
		b.taste();
		

	}

}

