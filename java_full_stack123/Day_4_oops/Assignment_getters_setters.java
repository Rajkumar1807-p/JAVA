package Day_4_oops;
import java.util.Scanner;
class Person 
{

	private String name;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{ 
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}
public class Assignment_getters_setters
{
	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		
		Person m=new Person();
		
		String str=s.next();
		
		m.setName(str);
		
		int age=s.nextInt();
		
		m.setAge(age);
		
		System.out.println(m.getName());
		
		System.out.println(m.getAge());
		s.close();
	}

}