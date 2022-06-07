package practice2;

import java.util.Hashtable;

public class HashTableClass {
public static void main(String[] args) {
	Hashtable<Integer, String> map = new Hashtable<Integer, String>();
	map.put(10, "10");
	map.put(20, "A");
	map.put(30, "hello");
	map.put(50, "good");
	map.put(10, "10");
//	System.out.println(map);
	
//	map.put(40, null);	====>null pointer exception
	map.remove(20);
	System.out.println(map);
}
}
