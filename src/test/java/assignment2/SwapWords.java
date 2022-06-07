package assignment2;

public class SwapWords {

	public static void main(String[] args) 
	{
		String s="i am dhanu";
		String[] a = s.split(" ");
		int key=0;
		for(int k=0;k<=key;k++)
		{
			String temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		for(  String in:a)
		{
			System.out.print(in+" ");
		}
	}
}
