package Day_2;

public class loops 
{
	public static void main(String[] args)
	{
		String[] c={"sai","aravind","rajkumar","srinja"};
		for (String x:c)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		for(int i=1;i<=20;i++)
		{
			int co=0;
			for (int j=1;j<=i;j++)
			{
				if (i%j==0)
				{
					co=co+1;
				}
			}
			if (co==2)
			{
				System.out.print(i+" ");
			}
		}
	}

}
//sai aravind rajkumar srinja 
//2 3 5 7 11 13 17 19 
