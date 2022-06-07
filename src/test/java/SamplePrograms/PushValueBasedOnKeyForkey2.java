package SamplePrograms;

public class PushValueBasedOnKeyForkey2 {

	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5};			//// ==>  3 4 5 1 2 
		int key=4;
		for(int j=0;j<key;j++)
		{
			int temp=a[0];			
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
