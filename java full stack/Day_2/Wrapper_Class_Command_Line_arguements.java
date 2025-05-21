package Day_2;

public class Wrapper_Class_Command_Line_arguements {
	public static void main(String[] args)
	{
		System.out.println(args[0]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
		System.out.println(args[5]);
		
		int a=Integer.parseInt(args[0]);
		String b=args[1];
		Float c=Float.parseFloat(args[2]);
		double d=Double.parseDouble(args[3]);
		char ch=args[1].charAt(0);
		Short s=Short.parseShort(args[4]);
		long l=Long.parseLong(args[5]);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(l);
		
	}

}
