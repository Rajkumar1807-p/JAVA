//abstract class cannot able to create the object and does not support constructor.
//it is a special type of method it invokes(call) while we create the object.
//it invokes how many time the object is created.
//constructor consists of public as access specifier
package Day_4_oops;
public class Constructor 
{
	int a=10;
	public Constructor(int a)
	{
		int b=a;
		System.out.println("Good Morning"+a);
	}
	public static void main(String[] args)
	{
		Constructor c=new Constructor(10);
		Constructor c1=new Constructor(20);
		Constructor c2=new Constructor(30);
	}
}
//topics: 
//1.....
//int a=10;
//public Constructor(int a)
//{
//	this.a=a;
//	System.out.println("Good Morning"+a);
//}

//2.....
//int a=10;
//public Constructor(int a)
//{
//	int b=a;
//	System.out.println("Good Morning"+a);
//}

