package com.davis.piersqure.searching;

//Time Complexity (Worst Case): O(n)
//Space Complexity (Worst Case): O(1)
public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 4, 2, 7, 1, 9, 5, 8 };
		int target = 9;

		int result = linearSearch(arr, target);

		if (result != -1) {
			System.out.println("Element :" + target + " found at index :" + result);
		} else {
			System.out.println("Element :" + target + " not found .");
		}

	}

	private static int linearSearch(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
