package com.davis.piersqure.array.leetCode.array.string;


//55.Jump game - Medium

//Example 1:

//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

public class JumpGame {
	
    public static boolean canJump(int[] nums) {
    	int length = nums.length;
    	int reachable = 0;
    	for(int i = 0; i < length; ++i) {
    		
    		if(reachable<i) 
    			return false;
    		
    		reachable = Math.max(reachable, i+nums[i]);
    		
    	}
       return true;
    }

	public static void main(String[] args) {
		
       int[] nums = {2,3,1,1,4};
       boolean flag = canJump(nums);
       System.out.println("Flag :: "+flag);
	}

}
