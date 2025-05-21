package Day_11;

public class circle 
{
	static int r=3;
	static int a=2,b=3;
	int side=5;
	static void triangle() {
		int b=6,h=5;
		System.out.print("Area of triangle: ");
		System.out.println(0.5f*b*h);
	}
	public static void main(String[] args) {
		circle c=new circle();
		System.out.print("Area of circle: ");
		System.out.println(3.14f*circle.r*circle.r);
		System.out.print("Area of rectangle: ");
		System.out.println(circle.a*circle.b);
		circle.triangle();
		System.out.print("Area of square: ");
		System.out.println(c.side*c.side);
	}

}
//static method local variables---triangle
//static method static variables--circle
//static method static vatiables--rectanle
//instance method instance variables