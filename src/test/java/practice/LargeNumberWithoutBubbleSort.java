package practice;

public class LargeNumberWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a= {15,5,28,65,20,-1,0,0};
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<large)
			{
				large=a[i];
			}
		}
		System.out.println(large);
	}

}
