package StringProgram2;

public class SegregateNumAnd_AddNUm {

	public static void main(String[] args) 
	{
	String s="a1b2c3";      			/// sum===> 6
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			int n = s.charAt(i)-'0';
			sum=sum+n;
		}
	}
	System.out.println("sum===>"+sum);
	}

}
