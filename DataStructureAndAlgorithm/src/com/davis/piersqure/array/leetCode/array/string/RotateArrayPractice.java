package com.davis.piersqure.array.leetCode.array.string;


//189. Rotate Array
// Medium
public class RotateArrayPractice {
	
   public static void rotate(int[] nums, int k) {
	   
	   int n = nums.length;
       k = k%n;
	   reverse(nums,0,n-1);
	   reverse(nums,0,k-1);
	   reverse(nums,k,n-1);  
	   
	   for(int value:nums) {
		   System.out.print(value+" ");
	   }
    }
   	
   public static void reverse(int nums[], int start, int end) {
	   
	   while(start<=end) {
		   int temp = nums[start];
		   nums[start] = nums[end];
		   nums[end] = temp;
		   start++;
		   end--;
	   }
	   
   }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		//int[] nums = {-1};
		//int k =2;
		int k = 3;
		rotate(nums,k);
	}

}


/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/