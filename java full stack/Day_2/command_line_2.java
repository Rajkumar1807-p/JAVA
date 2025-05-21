package Day_2;

public class command_line_2 {
	public static void main(String[] args)
	{
		String color=args[0];
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
		}
	}
}
