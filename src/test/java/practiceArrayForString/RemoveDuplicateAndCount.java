package practiceArrayForString;

import java.util.LinkedHashSet;

public class RemoveDuplicateAndCount {

	public static void main(String[] args) 
	{
		String a="Welcome";
		a=a.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}
		System.out.println(set);
		for(Character in:set)
		{
			int count=0;
			for(int i=0;i<a.length();i++)
			{
				if(in==a.charAt(i))
				{
					count++;
					break;
				}
			}
			System.out.println(in+":"+count);
		}
	}

}
