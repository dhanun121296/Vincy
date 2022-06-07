package Practice_Programs;

public class PrintNum 
{

	public static void num(int n)
	{
		if(n<=10)					/// ===>  1 2 3 4 5 6 7 8 9 10 
		{
			System.out.print(n+" ");
			num(n+1);
		}
	}
	public static void main(String[] args)
	{
		num(1);

	}

}
