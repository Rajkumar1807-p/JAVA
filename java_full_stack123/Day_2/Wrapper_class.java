package Day_2;

public class Wrapper_class {
	public static void main(String[] args)
	{
//	wrapper class in java provide a way to wrap or represent the value of premitive data types as an object.
//autoboxing: conversion of value of premitive data types as an object.
//unboxing: conversion of object as value of premitive data types.
//  By creating an object to the wrapper class,a data 			
//		int	    --  Integer
//		char	--  Character
//		boolean	--  Boolean
//		float	--  Float
//		double	--  Double
//		byte	--  Byte
//		short	--  Short
//		long	--  Long
		
//Why Use Wrapper Classes :
	//--To use primitives in collections like ArrayList, which only accept objects.
	//--To take advantage of utility methods, like Integer.parseInt().
	//--For autoboxing/unboxing support (automatic conversion between primitives and wrapper types).


		
		Integer b=10;
		int a=b;
		System.out.println(a);
		System.out.println(b.getClass());
		int z=Integer.parseInt(args[0]);
		System.out.println(z);
	}
}
