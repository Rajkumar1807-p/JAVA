package Day_5_oops;
interface I4
{
	void add();
}
class arithmetic{
	void sub() {
		System.out.println("Hello");
	}
}
public class ne_class_and_one_interface_into_a_class  extends arithmetic implements I4 {
	public void add()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		two_interfaces_in_one_class t1=new two_interfaces_in_one_class();
		t1.add();
		t1.sub();
	}
}