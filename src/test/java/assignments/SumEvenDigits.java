package assignments;

public class SumEvenDigits {

	public static void main(String[] args) 
	{
		int no=2345;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==1)
			{
			sum=sum+rem;
			}
			no=no/10;
		}
		System.out.println(sum);
	}

}
