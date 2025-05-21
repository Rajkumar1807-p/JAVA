package Day_3;

public class Saperate_vowels_constants {
	public static void main(String[] args)
	{
		String s="Helloworld";
		String v="";
		String c="";
		int c_count=0;
		int v_count=0;
		for (int i=0;i<s.length()-1;i++)
		{
			char a=s.charAt(i);
			if (a=='a' | a=='e' |a=='i' | a=='o' |a=='u')
			{
				v+=a;
				v_count+=1;
			}
			else
			{
				c+=a;
				c_count+=1;
			}
		}
		System.out.println(v);
		System.out.println(c);
		System.out.println(v_count);
		System.out.println(c_count);
		
	}

}
