package Workspace;

public class ReverseAStringWithSamePosition {

	public static void main(String[] args) 
	{
		String s="i am dhananjaya";
		String[] str = s.split(" ");		
		for(int i=0;i<str.length;i++)
		{
			String rev="";
			String s1 = str[i];
			for(int j=s1.length()-1;j>=0;j--)
			{
				rev=rev+s1.charAt(j);
			}
			System.out.print(rev+" ");
		}				
	}
}
