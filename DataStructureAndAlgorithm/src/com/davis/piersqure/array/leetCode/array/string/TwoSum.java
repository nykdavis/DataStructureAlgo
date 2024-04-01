package com.davis.piersqure.array.leetCode.array.string;

import java.util.HashMap;

//1. Two Sum
//LeetCode : Easy : Array
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new  HashMap<>();
        for(int i = 0; i< nums.length; i++) {
        	if(hm.containsKey(target-nums[i])) {
        		return new int[] {hm.get(target-nums[i]),i};
        	}
        	hm.put(nums[i], i);
        }        
        return new int[] {};
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {2,7,11,15};
		//int target = 9;
		
		int[] nums = {3,2,4};
		int target = 6;
		
		int[] result = twoSum(nums,target);
		for(int val:result) {
			System.out.print(val+" ");
		}
	}

}

/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/