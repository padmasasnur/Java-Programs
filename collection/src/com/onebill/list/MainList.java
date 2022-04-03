package com.onebill.list;

public class MainList {
 public static void main(String[] args) {
	 MyArrayList list = new MyArrayList(1);
	list.add(10);
	list.add(10);
	list.add(10);
	list.add(20);
	System.out.println(list.get(1));
}

}
