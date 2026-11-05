package com.java.dsa;

import java.util.Arrays;
public class OldToNewArray{
	public static void main(String[] args) {
	int[] oldarr= {10,20,30,40,50};
	int[] newarr= new int[oldarr.length+1];
	int pos=3;
	int value=56;
	for(int i=0;i<pos;i++) {
		newarr[i]=oldarr[i];
	}
		newarr[pos]=value;
	for(int i=pos;i<oldarr.length;i++) {
		newarr[i+1]=oldarr[i];
}
System.out.println(Arrays.toString(oldarr));
System.out.println(Arrays.toString(newarr));


	}}























//public class OldToNewArray {
//	public static void main(String[] args) {
//		int[]  oldarr= {20,40,50,60,85};
//		int pos=3;
//		int value=77;
//		int[] newarr=new int[oldarr.length+1];
//		for(int i=0;i<pos;i++) {
//			 newarr[i]=oldarr[i];	
//		}
//		
//		//inserting at positin
//		newarr[pos]=value;
//		
//		//copy remaing values in to new arr
//		
//		for(int i=pos;i<oldarr.length;i++) {
//			newarr[i+1]=oldarr[i];
//			
//		}
//		System.out.println("old arr: "+Arrays.toString(oldarr));
//		System.out.println("new array");
//		System.out.println(Arrays.toString(newarr));
//		
//		
//
//	}
//
//}
