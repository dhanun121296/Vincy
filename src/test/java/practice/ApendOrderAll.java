package practice;

public class ApendOrderAll {

	public static void main(String[] args) 
	{
		int[]a= {1,2,3,1,0,1,5,0,1,0};
		int []b=new int[a.length];
		int m=a[0];
		int n=a.length-1;					///////Wrongggggggg
		int k=0;		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==0)
			{
				b[m]=a[i];
				m++;
			}
			 if(a[i]==1)
			{
				b[n]=a[i];
				n--;				
			}
			
			else 
			{
				if(a[i]!=0) {
				b[k]=a[i];
				}
			}
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
