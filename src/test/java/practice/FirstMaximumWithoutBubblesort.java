package practice;

public class FirstMaximumWithoutBubblesort {

	public static void main(String[] args) 
	{
		int[]a= {5,24,6,45,7,45,0,0};
		int fmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=fmax)
			{
				fmax=a[i];
			}
		}
		System.out.println(fmax);
	}

}
