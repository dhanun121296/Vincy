package Practice_Programs;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int fib1=0;				////// ===>  0 1 1 2 3 5 8 13 21 34 55 89
		int fib2=1;
		int fib3=0;
		System.out.print(fib1+" "+fib2+" ");
		for(int i=0;i<10;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
		}

	}

}


	
