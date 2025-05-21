package Day_11;

public class arithmetic_operations_types_of_variables {
	int a=10,b=2;
	static int p=10,q=2;
	//instance variables
	void reminder() {
		System.out.println(a%b);
	}
	//static variables
	void mul() {
		System.out.println(p*q);
	}
	//local variables
	void div() {
		int a=10,b=2;
		System.out.println(a/b);
	}
	public static void main(String[] args)
	{
		arithmetic_operations_types_of_variables t1=new arithmetic_operations_types_of_variables();
		t1.reminder();
		System.out.println(t1.a%t1.b);
		t1.mul();
		System.out.println(arithmetic_operations_types_of_variables.p*arithmetic_operations_types_of_variables.q);
		t1.div();
	}

}
