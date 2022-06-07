package SamplePrograms;

public class SortingString {

	public static void main(String[] args) 
	{
		String s="how are you";			///==>  you how are
		 String s1 = s.split(" ")[0];
		 String s2 = s.split(" ")[1];
		 String s3 = s.split(" ")[2];
	//	 String s4 = s.split(" ")[3];
		 String ans = (s3+" "+s1+" "+s2);
		 System.out.println(ans);
	}
}

	