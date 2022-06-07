package practice2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class LinkedhasmapClass {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "10");
		map.put(20, "A");
		map.put(30, "hello");
		map.put(50, "good");
		map.put(10, "10");
		map.put(60, null);
		map.put(70, null);
		map.put(null,"hiiiii");
		map.put(null,"hii");


		map.remove(20);
		System.out.println(map);
		
		for(Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}
}
