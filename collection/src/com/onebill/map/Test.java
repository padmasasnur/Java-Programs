package com.onebill.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		
		HashMap <String,Long> map = new HashMap<>();
		map.put("soumya",  897865432l);
		map.put("aditya",897865432l );
		map.put("pramila",897865432l );
		
		Set<String> keySet = map.keySet();
		for(String name : keySet) {
		//	System.out.println(name); //get key set
		//	System.out.println(map.get(name)); //get values
			System.out.println(name + " " + map.get(name)); //to get both keyset and values
		}
		
		System.out.println("======");
		Set<Entry<String, Long>> entrySet = map.entrySet();
		Iterator<Entry<String, Long>> iterator = entrySet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
	}

}
