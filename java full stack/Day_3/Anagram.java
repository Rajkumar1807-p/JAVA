package Day_3;

public class Anagram {
	public static void main(String[] args){
		String s1="tone";
		String s2="note";
		int c=0;
		if (s1.length()==s2.length())
			for (int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				for (int j=0;j<s2.length();j++)
				{
					char ch1=s2.charAt(j);
					{
						if (ch==ch1)
							c+=1;
					}
				}
			}
		if (c==s1.length())
			System.out.println("Anagram");
		else
			System.out.println("not an Anagram");	
	}
}
