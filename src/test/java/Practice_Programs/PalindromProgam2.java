package Practice_Programs;

public class PalindromProgam2 {

	public static void main(String[] args)
	{
		String s="gadag";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("this is palindrom");
		}
		else
		{
			System.out.println("this is not palindrom");
		}
	}

}
