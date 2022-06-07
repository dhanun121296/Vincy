package assignment2;

public class PrintUnique {

	public static void main(String[] args) 
	{
		String s="hello";
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if(i!=j)
					{
						count++;
						break;
					}
				}
			}
			if(count==0)
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
	}

}
