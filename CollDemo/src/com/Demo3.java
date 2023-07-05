package com;

import java.util.*;
public class Demo3{
	public static void main(String[] args) {
		
		
		TreeSet a1 = new TreeSet();
		a1.add(100);
		a1.add(100);
		a1.add(200);
		a1.add(200);
		a1.add(700);
		a1.add(450);
		a1.add(987);
		a1.add(600);
		//a1.add(100);
		
		
	Iterator i = a1.iterator();
	while(i.hasNext())  {
		 System.out.println(i.next());
	}
	}
}




