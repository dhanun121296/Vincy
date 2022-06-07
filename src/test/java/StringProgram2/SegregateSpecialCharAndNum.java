package StringProgram2;

public class SegregateSpecialCharAndNum {

	public static void main(String[] args) 
	{
	String s="a1$Hb2K5*c%";	
	String a1="";			///===>  	aHbKc
	String sp="";			///===>     125
	String num="";			///===>     $*%
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			a1=a1+s.charAt(i);
		}
		else if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			num=num+s.charAt(i);
		}
		else
		{
			sp=sp+s.charAt(i);
		}		
	}
	System.out.println(a1);
	System.out.println(num);
	System.out.println(sp);
	}

}
