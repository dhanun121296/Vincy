package practiceArrayForString;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String a = sc.nextLine();
		
//		String a="dhanu";
		
	//	 String a = s.toUpperCase();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}
		for(Character in:set)
		{
			int count=0;
			for(int i=0;i<a.length();i++)
			{
				if(in==a.charAt(i))
				{
					count++;
					System.out.println("position==>"+in+":"+i);
				
				}
			}
			System.out.println("count==>"+in+":"+count);
		}
		
	}

}
