package practice;

public class SortingArrayInAscending {

	public static void main(String[] args) {
		int[] a= {15,5,28,65,20};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;	
				}
			}
		}
		System.out.println(a[0]);
//for(int m=0;m<a.length;m++)
//{
//	System.out.print(a[m]+" ");
//}
	}

}
