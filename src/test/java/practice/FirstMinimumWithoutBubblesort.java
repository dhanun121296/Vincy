package practice;

public class FirstMinimumWithoutBubblesort {

	public static void main(String[] args)
	{
		int[]a= {5,24,6,45,7};
		int fmin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				fmin=a[i];
			}
		}
		System.out.println(fmin);
	}

}
