package com.davis.piersqure.array.geeksforgeeks;
//If your Array is   {3,5,5,7,2,3,7,7,8,3,6,4,4,4,9}
//output will be {3,5,7,2,3,7,8,3,6,4,9}
public class RemoveNextDuplicate {

	public static void main(String[] args) {
		
		int arr[] =  {3,5,5,7,2,3,7,7,8,3,6,4,4,4,9};		
		int[] resultArr = removeContineousDuplicate(arr);
		
		for(int value:resultArr) {
		System.out.print(value + " ");
		}
	}

	private static int[] removeContineousDuplicate(int[] arr) {
		for(int i =0; i<arr.length-1;i++) {
			int j = i+1;
			while(arr[i]==arr[j]) {
				arr[j]=0;
				j = j+1;
			}
		}
		
		return arr;
		
	}

}
