package assignments;

import java.util.LinkedHashSet;

public class CountOfVowelsWithoutDuplicate {

	public static void main(String[] args) 
	{
		String[]str= {"naveen","joy","praveen","sunitha"};		
		for (int i = 0; i < str.length; i++)
		{
			int count=0;
			String word=str[i];
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
			for(int j=0;j<word.length();j++)
			{
				set.add(word.charAt(j));		
			}
			for(Character ch:set)
			{						
				if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
				{					
					count++;				
				}
			}
			System.out.println(word+" "+count);
		}
	}
}
