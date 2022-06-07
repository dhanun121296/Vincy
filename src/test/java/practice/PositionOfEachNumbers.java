package practice;

import java.util.LinkedHashSet;

public class PositionOfEachNumbers {

	public static void main(String[] args) 
	{

		int[] a= {5,2,5,7,0,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);				
		}
		for(Integer in:set)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==in)
				{
					System.out.println(in+":"+(i+1));
				}
			}
		}
	}

}
