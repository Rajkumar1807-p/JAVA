//compile time Polymorphism is called method overloading
//run time Polymorphism is called method overriding


//compile time polymorphism(method overloading 
package Day_5_oops;
class Sample{
	void show()
	{
		System.out.println("Good Morning");
	}
	void show(int a,int b)
	{
		System.out.println(a+b);
	}
	void show(double d1,double d2 )
	{
		System.out.println(d1-d2);
	}
	void show(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.show();
		s.show(12,22);
		s.show(38.7,54.3);
		s.show("sai ","kumar");
	}

}
