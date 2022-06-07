package practice2;

import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String[] args) {
	LinkedList<Object> link=new LinkedList<Object>();
	link.add(10);
	link.add(10.25);
	link.add('h');
	link.add(10);
	link.add("hai");
	link.add(null);
	System.out.println(link);
	System.out.println(link.getFirst());
	System.out.println(link.getLast());
	System.out.println(link.get(2));

}
}