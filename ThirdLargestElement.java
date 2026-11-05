package com.java.dsa;
import java.util.Scanner;
public class ThirdLargestElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
							
			}
				else if(arr[i] > second && arr[i] < first) {
				    third = second;
				    second = arr[i];
				
			}else if(arr[i]>third&&arr[i]<second) {
				third=arr[i];
			}
			
		}
		System.out.println(third);
		
		

	}

}
