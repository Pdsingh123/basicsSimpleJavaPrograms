package com.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List ll = new LinkedList();
		ll.add("Krishna");
		ll.add("Radhe");
		ll.add("Ram");
		ll.add("Shyam");
	
		
		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}

}
