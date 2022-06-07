package practice;

public class Sample {

	public static void main(String[] args)
	{

		int[] a= {0,0,15,5,3,28,65,20,65};
		int fMin=a[0];
		int sMin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fMin || fMin==fMin)
			{
				sMin=fMin;
				fMin=a[i];
			}
		}

		System.out.println(fMin);
		System.out.println(sMin);

	}

}
