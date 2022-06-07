package practice;

public class SecondMaximumWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a= {0,0,15,5,28,65,10,65,0,0,88,88};
		int fMax=a[0];
		int sMax=a[0];
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>=fMax )
		{
			if(a[i]!=fMax )
			{
				sMax=fMax;
			}
			fMax=a[i];
		}
			else if(a[i]>=sMax )
			{
				sMax=a[i];
			}
		}
		System.out.println("fMax==>"+fMax);
		System.out.println("sMax==>"+sMax);
		
	}

}
