package com.onebill.linkedhashsetcomp;

import java.util.Comparator;

public class ComparatorClass implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		Employee emp1 = (Employee) obj1;
		Employee emp2 = (Employee) obj2;
		return -(emp1.geteId() - emp2.geteId());
	}

}
