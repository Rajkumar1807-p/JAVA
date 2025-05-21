package Day_2;

public class For_and__for_each_loops {
	//Itterative statement:- executing the block of statements for multiple times
    //types :- for:- when we know the number of itterations 
    //while :-if you dint know the number of itterations but know the conditions for the terminations
    //do while:-at least execute once even  if the condition is fails
    //for each:-itteratite each and every value
	public static void main(String[] args)
	{
	int n=10;
	for (int i=0;i<=n;i++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	int a[]= {12,23,34,45};
	for(int x:a)
	{
		System.out.print(x+" ");
	}
	System.out.println();
	for (int i=0;i<4;i++) {
		System.out.print(a[i]+" ");
	}
	}

}
