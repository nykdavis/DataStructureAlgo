package com.davis.piersqure.array;

public class ArrayInsertionIndexBasics {

	// given array { 4, 2, 7, 3, 8 };
	// we will insert 9 at the 2nd index

	public static void main(String[] args) {
		int[] arr = { 4, 2, 7, 3, 8 };

		int index = 2;
		int value = 9;

		System.out.println("\nPrinting given array.");
		printing(arr);

		// Inserting value at particular index
		arr = elementInsertion(arr, value, index);

		System.out.println("\nNew array after value insertion at a given index.");
		printing(arr);
	}

	private static int[] elementInsertion(int[] arr, int value, int index) {
		int newArrLength = arr.length + 1;
		int[] newArr = new int[newArrLength];

		for (int i = 0, j = 0; i < newArrLength ; i++) {

			if (i == index) {
				newArr[i] = value;
			} else {
				newArr[i] = arr[j++];
			}

		}

		return newArr;

	}

	private static void printing(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}

	}

}
