package com.java.dsa;

//public class CompareArraysLength {
//	public static void main(String[] args) {
//		int[] arr1= {12,56,89,11};
//	   int[] arr2= {56,11,12,89};
//	boolean equal=true;
//	if(arr1.length!=arr2.length) {
//		System.out.println("both are not equal");
//	}else {
//		for(int i=0;i<arr1.length;i++) {
//				if(arr1[i]!=arr2[i]) {
//					equal=false;
//					break;			
//			}
//			
//		}
//		System.out.println(equal);
//	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public class CompareArraysLength {

	public static void main(String[] args) {
		int[] arr1= {45,12,85,69};
		int[] arr2= {12,69,99,85};
		boolean equal=true;
	
		if(arr1.length!=arr2.length) {
			System.out.println("not equal");
		
		}else {
			for(int i=0;i<arr1.length;i++) {
				 boolean found=false;
				for(int j=0;j<arr2.length;j++) {	
				if(arr1[i]==arr2[j]) {
					found=true;
					break;
					
				}}
				if(found==false) {
					equal=false;
					break;
					
					
				}
			}
			System.out.println(equal);
			}
		
		}
	}


