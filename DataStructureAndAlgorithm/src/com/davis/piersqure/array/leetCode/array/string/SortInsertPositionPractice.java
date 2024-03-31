package com.davis.piersqure.array.leetCode.array.string;

//Sort Insert position : leet code problem 35

public class SortInsertPositionPractice {
	//{1,3,5,6}
	 public static int searchInsert(int[] nums, int target) {
		 int left = 0;
		 int right = nums.length-1;
		 
		 if(target<nums[left]) {
			 return 0;
		 }
		 
		 if(target> nums[right]) {
			 return nums.length;
		 }
		 
		 while(left<right) {
			 int mid = left + (right-left)/2;
			 if(nums[mid] == target) {
				 return mid;
			 }
			 if(nums[mid]<target) {
				 left = mid+1;
			 }else{
				 right = mid;
			 }
			 
		 }
		 return  left;
	 }

	public static void main(String[] args) {

		int[] nums = {1,3,5,6};
		//int[] nums = {1};
        System.out.println("Answer  :  "+searchInsert(nums, 0));

	}

}

/*
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/
