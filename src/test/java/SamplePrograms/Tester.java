package SamplePrograms;

public class Tester {

	public static void main(String[] args)
	{
		String s="how are you";	
		String ss = null;
		for(int i=0;i<s.length();i++)
		{
			 String[] s1 = s.split(" ");
			 ss = s1[2]+" "+s1[0]+" "+s1[1];			
		}
		 System.out.println(ss);
	}
}
