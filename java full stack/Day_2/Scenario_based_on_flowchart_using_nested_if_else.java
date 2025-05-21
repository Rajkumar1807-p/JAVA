package Day_2;

public class Scenario_based_on_flowchart_using_nested_if_else {
	public static void main(String[] args)
	{
	int a=6;
	if (a>10)
	{
		System.out.println(a+" is greater than 10");
	}
	else
	{
		if (a%2==0)
		{
			System.out.println(a+" is less than 10 and divisible by 2");
		}
		else
		{
			System.out.println(a+" is less than 10 and not divisible by 2");
		}
	}
	}
}
