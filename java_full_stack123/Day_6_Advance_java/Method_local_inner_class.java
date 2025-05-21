package Day_6_Advance_java;

public class Method_local_inner_class {
	void show() {
		System.out.println("Hi");
		class Test12{
			void print() {
				System.out.println("Hello");
			}
		}
		Test12 t1=new Test12();
		t1.print();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_local_inner_class m1=new Method_local_inner_class();
		m1.show();
	}

}
