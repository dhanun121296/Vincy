package Practice_Programs;

public class ReverseString1 {	// using third variable & without using length()

	public static void main(String[] args)
	{
		String s="dhananjaya";			///===>  ayajnanahd
		String rev="";
		char[] ch = s.toCharArray();
		int count=0;
		for(char in:ch)
		{
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
	//	System.out.print(s.charAt(i));	
		}
		System.out.println(rev);
	}

}
