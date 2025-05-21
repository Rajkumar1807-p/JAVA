//two interfaces can be implimented into same class at a time.
//one class and one interface can be can be extended and implemented into a same class.
//two classes can not come to one interface.
//class cannot come to interface.

package Day_5_oops;
interface I2{
	void add();
}
interface I3{
	void add();
}
public class two_interfaces_in_one_class implements I2,I3 {
	public void add()
	{
		System.out.println("Hi");
	}
	public void sub()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		two_interfaces_in_one_class t1=new two_interfaces_in_one_class();
		t1.add();
		t1.sub();
	}

}
