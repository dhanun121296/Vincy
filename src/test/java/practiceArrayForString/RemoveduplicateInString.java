package practiceArrayForString;

import java.util.LinkedHashSet;

public class RemoveduplicateInString {

	public static void main(String[] args) 
	{
		String s="dhananjaya";
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character in:set)
		{
			System.out.print(in+" ");
		}
	}

}
