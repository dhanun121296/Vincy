package StringProgram2;

public class ReverseSentence {

	public static void main(String[] args)
	{
		String s="my name is dhanu";			/// ===> dhanu is name my
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}

	}

}
