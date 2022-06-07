package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) 
	{
		int[]a= {5,1,2,1,3,4,1};
		Set<Integer> h = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			h.add(a[i]);
		}
		System.out.println(h);
		
		
		
	}

}
