package practice;

public class SecondMinWithoutBubblesort {

	public static void main(String[] args) {
	
		int[] a= {0,0,15,5,28,65,20,5,0,0};
		int fMin=a[0];
		int sMin=a[0];
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]<=fMin)
		{
			if(a[i]!=fMin)
			{
				sMin=fMin;
			}	
		}
			else if(a[i]<=sMin )
			{
				sMin=a[i];
			}
			fMin=a[i];
		}
		System.out.println(fMin);
		System.out.println(sMin);
		
	}

}
