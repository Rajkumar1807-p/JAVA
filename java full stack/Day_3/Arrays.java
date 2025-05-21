package Day_3;

public class Arrays {
	public static void main(String[] args)
	{
		int a[]= {5,2,3,4,1,5,5};
		//print elements of array
		for (int x:a)
		{
			System.out.print(x+" ");
		}
		int count=0;
		System.out.println();
		//count number of elements in array
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			count++;
		}
		System.out.println();
		System.out.println(count);
		//find minimum
		int min=a[0];
		for (int z:a)
		{
			if (z < min)
				min=z;
		}
		System.out.println(min);
		//find max
		int max=a[0];
		for (int z:a)
		{
			if (z > max)
				max=z;
		}
		System.out.println(max);
		int arr1[]=new int[a.length];   //creation of new array using existing arrays
		//append non repeated values in the new array
		int index=0;
		for (int i=0;i<a.length;i++)
		{
			int co=0;
			for (int j=0;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					co++;
				}
			}
			if (co==1)
			{
				arr1[index++]=a[i];
			}
			co=0;
		}
		System.out.print("Non repeated list: ");
		for (int k=0;k<index;k++)
		{
			System.out.print(arr1[k]+" ");
		}
		
	}
}
