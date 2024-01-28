package com.davis.piersqure.array;

// given array { 4, 2, 7, 3, 8 };
// we will delete the 2nd index

public class ArrayDeletionIndexBasic {

	public static void main(String[] args) {
		
		int[] arr = { 4, 2, 7, 9, 3 };
		int index = 2;
		
		System.out.println(" \nPrinting the array");
		printing(arr);
		
		arr = deletionByIndex(arr, index);
		
		System.out.println("\n Printing the array");
		printing(arr);

	}

	private static int[] deletionByIndex(int[] arr, int index) {
		 int newArrLength = arr.length-1;
		 int[] newArr = new int[newArrLength];
		 
		 for(int i=0; i<arr.length-1; i ++  ) {
			 if(i>=index) {
				 newArr[i] = arr[i+1];
			 }else {
				 newArr[i] = arr[i];
			 }
		 }
		return newArr;
	}

	private static void printing(int[] arr) {
		for(int value:arr) {
			System.out.print(value + " ");
		}
		
	}

}
