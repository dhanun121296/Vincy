package Workspace;

public class SwapString {

	public static void main(String[] args) 
	{
		String s1="java"; ////4
		String s2="selenium";////8
		s1=s1+s2;  /// 12
		s2=s1.substring(0,s1.length()-s2.length());		
		s1=s1.substring(s2.length());
		
	//	s1=s1.substring(s2.length(), s1.length());			===> 2 parameter
	//	s1=s1.substring(s2.length());
				
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
	}

}
