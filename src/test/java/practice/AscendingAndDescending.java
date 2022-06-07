package practice;

public class AscendingAndDescending {

	public static void main(String[] args) {
		int[] a= {15,5,28,65,20};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;	
				}
			}
		}
		for(int m=0;m<a.length;m++)
		{
			System.out.print(a[m]+" ");
		}
		
		System.out.println();
		
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
	}

}
