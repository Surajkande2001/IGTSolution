package com;
import java.util.*;
public class Demo4 {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		
		map.put(111, "Suresh");
		map.put(555, "Ramesh");
		map.put(666, "Abi");
		map.put(234, "Chandan");
		map.put(777, "pratha");
		map.put(666, "Mavith");
		
		Set s  = map.entrySet();
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
