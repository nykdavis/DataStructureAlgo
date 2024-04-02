package com.davis.piersqure.array.leetCode.twoPointer;


//LeetCode
//167. Two Sum II - Input Array Is Sorted  
//two pointer : medium
public class TwoSumArray {
	// Input: numbers = [2,7,11,15], target = 9
	// Output: [1,2]

	// [5,25,75] 100
	public static int[] twoSum(int[] numbers, int target) {
		int l = 0;
		int r = 0;
		while (numbers[l] + numbers[r] != target) {
			 if (numbers[l] + numbers[r] < target) {
				l++;
			} else {
				r--;
			}
		}
		return new int[] {r+1,l+1};
	}

	public static void main(String[] args) {
        int[]  numbers = {2,7,11,15}; 
        int target = 9;
		int[] arr = twoSum(numbers,target);
		for(int value:arr) {
			System.out.print(value+" ");
		}
	}

}
