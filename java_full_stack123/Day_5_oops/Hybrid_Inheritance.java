package Day_5_oops;
class Movie
{
	void action()
	{
		System.out.println("Action and Thriller");	
	}
}
class Budget extends Movie{
	void cost()
	{
		System.out.println("100 cr.");
	}
}
class Hero extends Budget
{
	void name()
	{
		System.out.println("Nani");
	}
}
class Heroine extends Budget{
	void name1()
	{
		System.out.println("Deepia padukone.");
	}
	
}
public class Hybrid_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hit");
		Hero h1=new Hero();
		Heroine h2=new Heroine();
		h1.action();
		h1.cost();
		h1.name();
		h2.action();
		h2.cost();
		h2.name1();
	}
}
