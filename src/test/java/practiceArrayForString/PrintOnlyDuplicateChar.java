package practiceArrayForString;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateChar {

	public static void main(String[] args) 
	{
		String s="india";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character in:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(in==s.charAt(i))
				{
					count++;									}
			}
			if(count>1) 
			{
			System.out.println(in+" "+count);
			}
		}

	}

}
