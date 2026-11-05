package com.java.dsa;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		int[] arr= {11,22,33,44};
		int[] copyarr= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			copyarr[i]=arr[i];
		}
		System.out.print(Arrays.toString(copyarr));
	}

}
