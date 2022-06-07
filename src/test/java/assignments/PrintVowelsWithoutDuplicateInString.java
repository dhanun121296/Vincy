package assignments;

import java.util.LinkedHashSet;

public class PrintVowelsWithoutDuplicateInString {

	public static void main(String[] args) 
	{
		String a="india is my country";
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}
		
		for(Character ch:set)
		{												
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			{		
				System.out.print(ch);					
			}				
		}
	}

}
