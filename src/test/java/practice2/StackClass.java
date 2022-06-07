package practice2;

import java.util.ArrayList;
import java.util.Stack;

public class StackClass {
	public static void main(String[] args) 
	{
		Stack<Object> s=new Stack<Object>();
		s.push(10);
		s.push(10.25);
		s.push('h');
		s.push(10);
		s.push("hai");
		s.push(null);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());


}
}