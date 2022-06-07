package practice;

import java.util.HashSet;

public class PrintDuplicatewithcompare {

	public static void main(String[] args) 
	{
		int[]a= {5,4,2,1,2};
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
			System.out.println(in+"="+count);
//			if(count>1)
//			{
//				System.out.println(in+"="+count);
//			}
//			if(count==1)
//			{
//				System.out.println(in+"="+count);
//			}
		}
	}

}
