package SamplePrograms;

public class PrintPrimeNumb {

	public static void main(String[] args) 
	{
		int[]a= {3,4,5,6,7,8,9,10,11};			/// ===> 3 5 7 11 
		for(int j=0;j<a.length;j++)
		{
			int no=a[j];
			int i=2;
			while(no>=i)
			{
				if(no%i==0)
				{
					break;					
				}
				else
				{
					i++;
				}
			}
			if(no==i)
			{
				System.out.print(no+" ");
			}
		}
		
		

	}

}
