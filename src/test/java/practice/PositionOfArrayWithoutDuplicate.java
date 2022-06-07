package practice;

import java.util.LinkedHashSet;

public class PositionOfArrayWithoutDuplicate {

	public static void main(String[] args) 
	{
		int[] a= {5,2,5,7,0,1};
		LinkedHashSet<Integer> list=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);				
		}
		for(Integer in:list)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==in)
				{
					System.out.println(in+":"+i);
				//	break;

				}
			}

		}
	}

}
