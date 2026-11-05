package com.java.dsa;

public class ArraySum {

	public static void main(String[] args) {
		int[] arr= {85,45,63,12};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println(sum);
		System.out.println(avg);
		// TODO Auto-generated method stub

	}

}
