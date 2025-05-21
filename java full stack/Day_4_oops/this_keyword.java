//this is a keyword used to access the current class properties at any where in the entire class.

package Day_4_oops;

public class this_keyword {
	int a=69;
	public void add()
	{
		System.out.println("add");
	}
	public void sub()
	{
		this.add();
		System.out.println(this.a);  //now 69 is local variable to sub even though it is a class level variable.since it is used by using this keyword
	}
	public static void main(String[] ags)
	{
		this_keyword t=new this_keyword();
		t.sub();
		
	}

}
