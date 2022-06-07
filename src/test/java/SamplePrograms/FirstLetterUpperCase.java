package SamplePrograms;

public class FirstLetterUpperCase {

	public static void main(String[] args) 
	{
		String s="welcome to india";		/// ===>  Welcome To India 
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{					
			String word = str[i].substring(0,1).toUpperCase()+str[i].substring(1);			
			System.out.print(word+" ");			
		}		
	}
}
