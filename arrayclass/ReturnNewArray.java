package com.onebill.arrayclass;

public class ReturnNewArray {
	public static int[] returnArray(int[] array) {
		int[] a = new int[2];
		if (a.length < 2) {
			a[0] = array[0];
		} else {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (count < 2) {
					a[i] = array[i];
				} else {
					break;
				}
				count++;
			}
		}

		return a;
	}

	public static void main(String[] args) {
		int array[] = { 10, 20, 60, 67, 89 };
		int b[] = returnArray(array);
		for (int i = 0; i < b.length; i++) {
			System.out.println("Element : " + b[i]);
		}

	}

}
