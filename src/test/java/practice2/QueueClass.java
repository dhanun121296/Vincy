package practice2;

import java.util.PriorityQueue;

public class QueueClass {
	
	public static void main(String[] args) {
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		PriorityQueue<Object> pq1=new PriorityQueue<Object>();
		pq1.add('a');
		pq1.add('b');
		pq1.add('c');
		pq1.add('d');
		System.out.println(pq1);
		System.out.println(pq1.peek());
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		
	

		
}
}