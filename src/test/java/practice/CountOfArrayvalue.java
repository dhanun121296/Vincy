package practice;

import java.util.LinkedHashSet;

public class CountOfArrayvalue {

	public static void main(String[] args) 
	{
//		int[] a= {5,2,5,7,0,1};
		int[] a= {5,4,2,1,2};

		LinkedHashSet<Integer> list=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);				
		}
		for(Integer in:list)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==in)
				{
					count++;
					break;
				}
			}
			System.out.println(in+":"+count);
		}
	}

}
