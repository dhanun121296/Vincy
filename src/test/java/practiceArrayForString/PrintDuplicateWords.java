package practiceArrayForString;

import java.util.LinkedHashSet;

public class PrintDuplicateWords {

	public static void main(String[] args)
	{
		String s="welcome to india welcome to mandya";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String in:set)
		{ 
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(in.equals(str[i]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(in+" "+count);
			}
		}

	}

}
