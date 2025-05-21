package Day_3_oops;
abstract class Test{
	abstract void print();
	abstract void add();
	abstract void display();
	abstract void show();
	void play() {
		System.out.println("I am playing");
	}
	static void dance() {
		System.out.println("I am dancing");
	}
}
class Abstraction extends Test {
	public void print() {
		System.out.println("Hi");
	}
	public void add() {
		System.out.println("Hello");
	}
	public void display() {
		System.out.println("class,object,encapsulation,polymorphism,inheritance,abstraction.");
	}
	public void show() {
		System.out.println("class,object,abstraction.");
		
	}
	public static void main(String[] args) {
		Abstraction a1=new Abstraction();
		a1.print();
		a1.add();
		a1.display();
		a1.show();
		a1.play();
		Abstraction.dance();
		
		
	}
}
