package com.java.dsa;

import java.util.Arrays;
public class DeleteCase {

	public static void main(String[] args) {
		int[] oldarr= {56,85,44,12,69};
		int[] newarr=new int[oldarr.length-1];
		int pos=2;
		for(int i=0;i<pos;i++) {
			newarr[i]=oldarr[i];
		}for(int i=pos;i<newarr.length;i++) {
			newarr[i]=oldarr[i+1];
		}  
		System.out.println(Arrays.toString(oldarr));
		System.out.println(Arrays.toString(newarr));
		
	}}





























//public class DeleteCase {
//
//	public static void main(String[] args) {
//		int[] oldarr= {56,85,44,12,69};
//		int pos=3;
//		int newarr[]=new int[oldarr.length-1];
//		for(int i=0;i<pos;i++) {
//			newarr[i]=oldarr[i];
//		}for(int i=pos;i<newarr.length;i++) {
//			newarr[i]=oldarr[i+1];
//		}
//		System.out.println("old array:"+Arrays.toString(oldarr));
//		System.out.println("new arry: "+Arrays.toString(newarr));
//		// TODO Auto-generated method stub
//
//	}
//
//}
