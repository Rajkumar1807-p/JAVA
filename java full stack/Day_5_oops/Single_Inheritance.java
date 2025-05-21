package Day_5_oops;
class Animal{
	void sleep()
	{
		System.out.println("sleeping.");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("dog is barking.");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a=new Dog();
		a.sleep();
		a.bark();

	}

}
