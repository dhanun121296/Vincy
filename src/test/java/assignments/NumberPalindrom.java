package assignments;

public class NumberPalindrom {

	public static void main(String[] args) 
	{
		int num=454;
		int rem=0;
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=rem+(sum*10);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("this is palindrom");
		}
		else
		{
			System.out.println("this is not palindrom");
		}
	}

}
