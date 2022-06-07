package practiceArrayForString;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args)
	{
	String s="welcome to india welcome to mandya";
	String[] str=s.split(" ");
	
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	
	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
	}	
	
	for(Object in:set)
	{
		System.out.print(in+" ");
	}	
	}
}
