package com.davis.piersqure.sorting;

//TimeComplexity : O(n2)
//Space Complexity : O(1)

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {46,23,78,56,90,92,54,67,99};
		
		System.out.println("Printing array before sorting.");
		printArray(arr);
		
		selectionSort(arr);
		
		System.out.println("\nPrinting Array after sorting.");
		printArray(arr);

	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			int minValue = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[minValue]) {
					minValue = j;
				}
			}
			
			int temp = arr[minValue];
			arr[minValue] = arr[i];
			arr[i] = temp;
			
		}
		
	}  
	

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int value:arr) {
			System.out.print(value+ " ");
		}
		
	}

}
