package Day_3;

public class Count_string_method {
	public static void main(String[] args)
	{
		String s="Helloworld";
		int c=0;
		for (int i=0;i<s.length()-1;i++)
		{
			char a=s.charAt(i);
			if (a == 'l' | a== 'L')
			{
					c+=1;
			}
		}
		System.out.println(c);
	}
			

}
