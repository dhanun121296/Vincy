package practice;

public class ApendsOrder {

	public static void main(String[] args) 
	{
		int[]a= {1,1,2,3,0,1,0,1,0,1};
		int []b=new int[a.length];
		int m=0;
		int n=a.length-1;
		int k=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[n]=a[i];
				n--;
			}
			else if(a[i]==1)
			{
				b[m]=a[i];
				m++;
			}
			else if(a[i]!=1 || a[i]!=0)
			{
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
