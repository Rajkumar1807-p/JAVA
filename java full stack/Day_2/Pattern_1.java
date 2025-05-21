package Day_2;

public class Pattern_1 {
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		//* * * * * 
		//* * * * * 
		//* * * * * 
		//* * * * * 
		//* * * * * 
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print((i+1)+" ");
			}
			System.out.println();

		}
		//1 1 1 1 1 
		//2 2 2 2 2 
		//3 3 3 3 3 
		//4 4 4 4 4 
		//5 5 5 5 5 
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print((j+1)+" ");
			}
			System.out.println();

		}
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		int k=0;
		while(k<5)
		{
			int l=0;
			while(l<5)
			{
				System.out.print("* ");
				l++;
			}
			System.out.println();
			k++;
		}
		//* * * * * 
		//* * * * * 
		//* * * * * 
		//* * * * * 
		//* * * * * 
	}

}
