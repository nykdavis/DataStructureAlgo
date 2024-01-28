package com.davis.piersqure.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {46,23,78,56,90,92,54,67,99,1};
		
		System.out.println("Printing array before sorting.");
		printArray(arr);
		
		bubbleSort(arr);
		
		System.out.println("\nPrinting Array after sorting.");
		printArray(arr);

	}
	
	
	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i< n-1; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}


	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int value:arr) {
			System.out.print(value+ " ");
		}
	}	

}
