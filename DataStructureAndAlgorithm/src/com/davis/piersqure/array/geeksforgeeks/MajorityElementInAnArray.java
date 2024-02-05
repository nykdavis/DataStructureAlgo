package com.davis.piersqure.array.geeksforgeeks;

//Check for Majority Element in a sorted array, majority should be greater then half of the array
//Input: arr[] = {1, 1, 2, 4, 4, 4, 6, 6}, x = 4
public class MajorityElementInAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 4, 4, 4, 6 };

		int majorityElement = findMajority(arr);

		if (majorityElement == -1) {
			System.out.println("There is no Majority Element");
		} else {			
			System.out.println(majorityElement + "  Is majority element.");
		}

	}

	private static int findMajority(int[] arr) {
		int candidate = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == candidate) {
				count++;
			} else {
				count--;
				if (count == 0) {
					candidate = arr[i];
					count = 1;
				}
			}
		}

		count = 0;
		for (int value : arr) {
			if (value == candidate) {
				count++;
			}
		}
		
		return (count > arr.length/2) ? candidate : -1;
	}

}
