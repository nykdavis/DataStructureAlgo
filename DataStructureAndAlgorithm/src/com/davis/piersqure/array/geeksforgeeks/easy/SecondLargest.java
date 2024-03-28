package com.davis.piersqure.array.geeksforgeeks.easy;

public class SecondLargest {

	public static void main(String[] args) {
	
		//int[] arr = {34,56,32,98,105,2,57,97};
		int[] arr = {54,12};
		
		int largest= arr[0];
		int secondLargest = arr[0];
		for(int i =0; i< arr.length-1; i++) {
			if(arr[i+1]>largest) {
				secondLargest = largest;
				largest = arr[i+1];
			}
		}
		
		
		System.out.println("secondLargest: "+secondLargest);

	}

}
