package Day_11;

public class logicaloperators_types_of_variables {
	boolean a=true,b=false;
	static boolean p=true,q=false;
	//instance variables
	void and() {
		System.out.println(a&b);
	}
	void or() {
		System.out.println(p|q);
	}
	//local variables
	void not() {
		boolean x=true;
		System.out.println(!x);
	}
	public static void main (String[] args)
	{
		logicaloperators_types_of_variables l1=new logicaloperators_types_of_variables();
		//instance variables
		l1.and();
		System.out.println(l1.a&l1.b);
		//static variables
		l1.or();
		System.out.println(logicaloperators_types_of_variables.p|logicaloperators_types_of_variables.q);
		//local variables calling
		l1.not();
	}
}
