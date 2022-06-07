package assignments;

import java.util.LinkedHashSet;

public class PrintVowels {

	public static void main(String[] args)
	{
		String s="india";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{						
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
			{	
				set.add(s.charAt(i));								
			}						
		}	
		
		for(Character in:set)
		{
		System.out.print(in);
		}
	}

}
