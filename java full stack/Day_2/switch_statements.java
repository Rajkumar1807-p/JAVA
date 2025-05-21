package Day_2;
import java.util.*;
public class switch_statements {
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		String color=s.next();
		switch (color)
		{
			case "red":
				System.out.println("Celebrate holi");
				break;
			case "green":
				System.out.println("Celebrate Ramzan");
				break;
			case "white":
				System.out.println("Celebrate christmas");
				break;
			case "orange":
				System.out.println("Celebrate Sri Rama Navami");
				break;
			default:
				System.out.println("No festival");
			s.close();
		}
	}
}
