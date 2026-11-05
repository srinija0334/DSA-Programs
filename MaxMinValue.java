package com.java.dsa;

public class MaxMinValue {

	public static void main(String[] args) {
		int[] arr= {56,23,89,45};
		int max=arr[0];
	int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}else if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		// TODO Auto-generated method stub

	}

}
