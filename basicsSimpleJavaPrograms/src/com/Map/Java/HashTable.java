package com.Map.Java;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<>();
		ht.put(101, "a");
		ht.put(102, "b");
		ht.put(105, "c");
		ht.put(103, "d");
		ht.put(104, "e");
		//ht.put(null, "a");
		System.out.println(ht);
		System.out.println(ht.containsKey("e"));
		for(Map.Entry<Integer,String>entry:ht.entrySet()) {
			System.out.println(entry.getValue()+" "+entry.getKey());
		}
		
		
	}

}
