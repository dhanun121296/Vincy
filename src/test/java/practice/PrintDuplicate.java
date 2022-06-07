package practice;

import java.util.HashSet;

public class PrintDuplicate {

	public static void main(String[] args) 
	{
		int[]a= {5,4,2,1,4,2,4};
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);

		for( Integer in : set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==in)
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(in+"="+count);
			}
		}
	}

}
