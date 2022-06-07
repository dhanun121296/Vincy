package practiceArrayForString;

import java.util.LinkedHashSet;

public class occuranceOfEachCharacter {

	public static void main(String[] args) 
	{
		
		String s="india";
		// step1: remove duplicate of character from given String
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		//step2: compare each char of set with all the char of the given string
		for(Character in:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(in==s.charAt(i))
				{
					//step3: if it is matching increase the count
					count++;									}
			}
			//step4: print both char and count
			System.out.println(in+" "+count);
		}
	}

}
