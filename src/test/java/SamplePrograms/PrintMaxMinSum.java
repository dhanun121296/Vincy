package SamplePrograms;

public class PrintMaxMinSum {

	public static void main(String[] args)
	{
		int[]a= {2,5,2,7,6};						// fmax===>7						
													// fmin===>2
													// sum===>9
		int fmax=a[0];
		int fmin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				fmax=a[i];
			}
			
			if(a[i]<fmin)
			{
				fmin=a[i];
			}
			
		}
		System.out.println("fmax"+"===>"+fmax);
		System.out.println("fmin"+"===>"+fmin);
		
	int sum = fmax+fmin;
	System.out.println("sum"+"===>"+sum);

	}

}
