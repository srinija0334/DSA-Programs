package com.java.dsa;

public class FindMissingElement {

	public static void main(String[] args) {
int[] array= {2,3,5,6,7};//missing element
		
		int n=array.length;
		int expected=0;
		
		for(int i=0;i<=n;i++) {
			expected=expected+i;
			
		}
		
		int actual=0;
		for(int x:array) {
			actual=actual+x;
		}
		
		int missing=expected-actual;
		System.out.println("missing element: "+missing);
		
	}}