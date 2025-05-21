//interface is loosely coupled class and allows multiple inheritance.
//abstract class accepts abstract methods,static and instance but,
//interface does not accept ant other methods.it only accepts abstract methods.
//it is not needed to be write the keyword "abstract".
//it would be take automatically.

//interface ---- interface---use extends
//interface ---- class---use implements
//class ---- class ---use extends
//class ---- interface----not possible


package Day_5_oops;
interface I1{
	abstract void add();
	void sub();
}

public class Interface implements I1{
	public void add()
	{
		System.out.println("hi");
	}
	public void sub()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface t1=new Interface();
		t1.add();
		t1.sub();

	}

}
