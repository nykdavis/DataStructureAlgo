package com.davis.piersqure.array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 7, 3, 8 };

		System.out.println(" \nPrinting original Array:");
		printArray(arr);

		reverseArray(arr);
		System.out.println("\n Reversed array");

		printArray(arr);

	}

	private static void reverseArray(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

}
