package Day_3;

public class Duplicate_values {
	public static void main(String[] args){
		String s="helloworld";
		int c=0;
		String r="";
		for (int i=0;i<s.length()-1;i++)
		{
			for (int j=0;j<s.length()-1;j++)
			{
				if (s.charAt(i)==s.charAt(j))
				{
					c+=1;
				}
			}
			if (c>=2)
			{
				r+=s.charAt(i);
			}
			c=0;
		}
		System.out.println(r);
	}

}
