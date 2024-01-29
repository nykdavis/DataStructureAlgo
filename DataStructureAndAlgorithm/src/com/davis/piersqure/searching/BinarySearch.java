package com.davis.piersqure.searching;

// time complexity  O(log n)
// space complexity  O(1)
public class BinarySearch {

	public static void main(String[] args) {

		int[] sortedArray = { 3, 6, 7, 12, 45, 47, 57, 67, 88, 90 };
		int target = 7;

		int index = binarysearch(sortedArray, target);

		if (index != -1) {
			System.out.println("Element " + target + " is found in index " + index);
		} else {
			System.out.println("Element " + target + " is not found");
		}

	}

	private static int binarysearch(int[] sortedArray, int target) {

		int left = 0;
		int right = sortedArray.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (sortedArray[mid] == target) {
				return mid;
			}
			if (target > sortedArray[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
