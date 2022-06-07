package assignment2;

import java.util.LinkedHashSet;

public class MultiplyAll2 {

	public static void main(String[] args) 
	{
		String s="india";			///// ===> in id ii ia nd ni na di da		
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{				
				set.add(s.charAt(i)+""+s.charAt(j));				
			}
		}
		for(String in:set)
		{
			System.out.print(in+" ");
		}
	}
}
