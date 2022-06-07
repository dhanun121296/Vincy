package assignments;

public class VowelsWithCountProgramWithDplicate
{
	public static void main(String[] args)
	{
		String[]str= {"naveen","joy","praveen","sunitha"};
		
		for(int i=0;i<str.length;i++)
		{
			String s=str[i];
		//	s=s.toLowerCase();
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char ch = s.charAt(j);
				if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
				{
					count++;					
				}
			}			
			System.out.println(s+" "+count);
		}
	}
}
