package assignment2;

import java.util.LinkedHashSet;

public class MultiplyAll {

	public static void main(String[] args) 
	{
		String a="india";			///// ===> in id ii ia nd ni na di da
		char[] s = a.toCharArray();
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				String temp="";
				if(i!=j)
				{
					temp=s[i]+""+s[j];
					set.add(temp);
				}
			}
		}
		for(String in:set)	
		{
			System.out.print(in+" ");
		}
	}

}
