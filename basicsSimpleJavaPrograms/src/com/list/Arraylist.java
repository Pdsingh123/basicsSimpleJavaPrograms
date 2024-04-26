package com.list;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new CopyOnWriteArrayList();
		
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(101);
		list.set(0, 105);
		
		/*System.out.println("Get the elements: "+list.get(1));
	//	list.remove(0);
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		for( int x:list) {
			System.out.println(x);*/
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			list.add(109);
		}
		System.out.println(list);

		
		
	}

}
