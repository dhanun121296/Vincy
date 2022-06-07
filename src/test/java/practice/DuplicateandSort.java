package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateandSort {	

	public static void main(String[] args) 
	{

		int[]a= {5,4,2,1,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);				//wronggggggg//
		}
		System.out.println(set);
		
		ArrayList<Integer> list=new ArrayList<Integer>(set);

		for(int j=a.length-1;j>=0;j--)
		{
			list.add(a[j]);
		}
		
		System.out.println(list);
		
		
		/*
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
			System.out.print(list);
   */
	}

}
