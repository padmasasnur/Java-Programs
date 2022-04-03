package com.onebill.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//It does not maintain the insertion order 
//won't take the duplicate values
public class Test {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<>();
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add(40);
		hashset.add(50);
		Iterator<Integer> iterator = hashset.iterator();// object.iterator();//it prints
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("=======In insertion order=======");
		// linkedHashSet maintains the insertion order but won't take duplicate value
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add(10);
		linkedhashset.add(20);
		linkedhashset.add(30);
		linkedhashset.add(40);
		linkedhashset.add(50);
		Iterator<Integer> iterator1 = linkedhashset.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		System.out.println("=======Sorts=======");
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(20);
		treeset.add(50);
		treeset.add(30);
		treeset.add(10);
		treeset.add(40);
		Iterator<Integer> iterator2 = treeset.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
