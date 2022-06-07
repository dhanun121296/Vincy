package practiceArrayForString;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ToPrintPositionOfCharacter {

	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		String s = sc.nextLine();
//		 String a = s.toUpperCase();
		 
		 String a="program";
		 
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}
		for(Character in:set)
		{
			
			for(int i=0;i<a.length();i++)
			{
				if(in==a.charAt(i))
				{
					System.out.println(in+":"+i);
				//	break;
				}
			}
		}
		
	}

}
