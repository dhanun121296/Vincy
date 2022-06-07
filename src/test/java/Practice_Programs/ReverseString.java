package Practice_Programs;

public class ReverseString {

	public static void main(String[] args) 
	{
	String s="dhananjaya";					///===>  ayajnanahd
	char[] ch = s.toCharArray();
	int count=0;
	for(Object in:ch)
	{
		count++;
	}
	for(int i=count-1;i>=0;i--)
	{
	System.out.print(s.charAt(i));	
	}
	}

}
