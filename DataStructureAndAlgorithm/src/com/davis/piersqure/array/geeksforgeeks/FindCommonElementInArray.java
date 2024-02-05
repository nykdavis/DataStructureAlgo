package com.davis.piersqure.array.geeksforgeeks;

/*Given three Sorted arrays in non-decreasing order, print all common elements in these arrays.
 * Examples: 

Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80

Input: 
ar1[] = {1, 5, 5} 
ar2[] = {3, 4, 5, 5, 10} 
ar3[] = {5, 5, 10, 20} 
Output: 5, 5


 */

public class FindCommonElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

		// Find out the common in 1st and 2nd array
		commonSearch(ar1, ar2, ar3);

	}

	private static void commonSearch(int[] ar1, int[] ar2, int[] ar3) {
		for (int value : ar1) {
			int searchFirst = binarySearch(value, ar2);
			int searchSecond = binarySearch(value, ar3);
			if (searchFirst == searchSecond && searchFirst != -1 && searchSecond != -1) {
				System.out.print(searchFirst + " ");
			}
		}

	}

	private static int binarySearch(int value, int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (value == arr[mid]) {
				return value;
			}
			if (value > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
