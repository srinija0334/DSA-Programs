package com.java.dsa;

import java.util.Arrays;


public class MergeArrays {

	public static void main(String[] args) {
		int[] arr1= {45,96,36,12};
		int[] arr2= {89,55,66,44};
		int[] mergearr= new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			mergearr[i]=arr1[i];
		}for(int i=0;i<arr2.length;i++) {
			mergearr[arr1.length+i]=arr2[i];
		}
		System.out.println(Arrays.toString(mergearr));
		
	
	
	
	
	}}




















//public class MergeArrays {
//
//	public static void main(String[] args) {
//		int[] arr1= {45,96,36,12};
//		int[] arr2= {89,55,66,44};
//		int[] arr3= new int[arr1.length+arr2.length];
//		System.arraycopy(arr1,0,arr3,0,arr1.length);
//		System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
//		System.out.println(Arrays.toString(arr3));
//	
//
//	}
//
//}
