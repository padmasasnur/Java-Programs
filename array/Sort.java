package com.onebill.array;

public class Sort {
	public static void main(String[] args) {
	    int[] array = {4,2,1,3,5,9,6,8,7};
	    for(int i = 0 ; i < array.length;i++)
	    {
	        for(int j = i+1 ; j< array.length;j++)
	        {
	            if(array[i] > array[j])
	            {
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
	}
}

//package com.onebill.array;
//
//public class BubbleSort {
//	public static void main(String[] args) {
//		int[] a = {7,45,3,18,1,10,17,8,99};
//		int temp = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j<a.length; j++) {
//			if (a[i]<a[j]) {
//				temp = a[i];
//				a[i] = a[j];
//				a[j] = temp;
//			}
//	    
//	}
//}
//	
//	}
//}

