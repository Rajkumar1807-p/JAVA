package Day_2;

public class nested_if_2 {
	public static void main(String[] args)
	{
	int a=21;
	if (a%2==0)
	{
		if (a%3==0)
		{
			System.out.println(a+" is divisile by 6.");
		}
		else
		{
			System.out.println(a+" is not divisile by 6.");

		}
	}
	else
	{
		System.out.println(a+" is not divisile by 2.");
	}
	}
}
