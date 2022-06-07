package assignments;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int no=7;
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(no+" is prime number");
		}
		else
		{
			System.out.println(no+" is not prime number");
		}
	}

}
