package Workspace;

import java.util.TreeSet;

public class SquqreOfNumbers {

	public static void main(String[] args) 
	{
	int[]a= {22,33,45,6};							//===>    36,529,1089,2025
	TreeSet<Integer>set=new TreeSet<Integer>();
	for(int i=0;i<a.length;i++)
	{		
		set.add(a[i]);
		//System.out.print((a[i]*a[i])+" ");
	}
	for(Integer in:set)
	{
		System.out.print(in*in+" ");
	}
	}

}
