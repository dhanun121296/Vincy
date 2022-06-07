package SamplePrograms;

public class PrimeNum {

	public static void main(String[] args)
	{
	int[] a= {1,2,3,4,5,6,7,8,9,10,11};				//		prime number===> 5 
													//		not prime number===> 6 
													//		prime number===> 7 
													//		not prime number===> 8 
													//		not prime number===> 9 
													//		not prime number===> 10 
													//		prime number===> 11 

	for(int i=0;i<a.length;i++)
	{
		int c=0;
		for(int j=2;j<i;j++)
		{
			if(a[i]%j==0)
			{
				c=1;
				break;
			}
		}
		if(c==1)
		{
			System.out.println("not prime number===> "+a[i]+" ");			
		}
		else
		{ 
			System.out.println("prime number===> "+a[i]+" ");
		}		
	}
	}
}
