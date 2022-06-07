package SamplePrograms;

public class PrimeNumberProgram {

	public static void main(String[] args) 
	{
		int[] a= {3,4,5,6,7,8,9,10,11};					///// ===> 3 5 7 11 
		for(int j=0;j<a.length;j++)
		{
			int no=a[j];
			boolean flag = true;
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
				System.out.print(no+" ");
			}
		}

	}

}
