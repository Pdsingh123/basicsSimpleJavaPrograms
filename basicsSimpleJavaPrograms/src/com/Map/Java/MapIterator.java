package com.Map.Java;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		map.put("Ram", 101);
		map.put("Shyam", 102);
		map.put("Psk", 103);
		map.put("Radhe", 104);
		map.put("Pd", 105);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.containsKey("Pd"));
		System.out.println(map.equals("Psk"));
		System.out.println(map.hashCode());
		System.out.println(map.size());
		
		for(Map.Entry entry:map.entrySet()){
			System.out.println(entry.getKey()+ " "+entry.getValue());
			
		}
	}

}
