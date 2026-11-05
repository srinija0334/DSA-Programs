package com.java.dsa;
import java.util.Scanner;
public class SecondLargestElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int firstlargest=Integer.MIN_VALUE;
		int secondlarger=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		if(arr[i]>firstlargest) {
			secondlarger=firstlargest;
			firstlargest=arr[i];
		}else if(arr[i]>secondlarger&&arr[i]<firstlargest){
			secondlarger=arr[i];
			
		}
			
		}
		System.out.println(secondlarger);
		
		
		
	}

}
