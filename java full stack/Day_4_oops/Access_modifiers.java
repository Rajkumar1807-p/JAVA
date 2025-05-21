//access modifiers:
//	protected
//	private
//	public default
//


package Day_4_oops;
public class Access_modifiers 
{
//	private void add()   //  can no be accessed out side of class	
//	public void add()    //it can be accessed any where in the package and out of the package by importing the package.
//	void add()   //default //no keyword indicates default.It can be accessed in any class inside the package.
	protected void add()  //it can be accessed within the package.in outside of package it can be accessed using extends
	{
		System.out.println("hi");
	}
}
//public class Access_modifiers extends Demo{
//	public static void main(String[] args)
//	{
//		Access_modifiers a=new Access_modifiers();
//		a.add();
//	}
//}
