package com.java.dsa;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {11,22,33,44,55};
		int[] revarr= new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			revarr[j]=arr[i];
			j++;
			
		}
		System.out.print(Arrays.toString(revarr));

	}

}

//public class ReverseArray {
//
//	public static void main(String[] args) {
//		int[] arr= {11,22,33,44,55};
//		int[] revarr= new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//			System.out.println();
//			
//		}for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
//		
//
//	}
//
//}
