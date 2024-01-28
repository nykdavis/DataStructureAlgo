package com.davis.piersqure.sorting;


public class InsertionSort {
	
//Time complexity O(n2);
//Space Complexity O(1);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,11,13,5,6};
		
		System.out.println("Display Array");
		print(arr);
		
		System.out.println("Going for Insertion Sort");
		insertionSort(arr);
		print(arr);

	}

	private static void insertionSort(int[] arr) {
		int n= arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j= i-1;
			
			while(j>=0 && arr[j]>key ) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1] = key;
			
		}
		
	}

	private static void print(int[] arr) {
		for(int value:arr) {
			System.out.print(value+ " ");
		}
		
	}

}
