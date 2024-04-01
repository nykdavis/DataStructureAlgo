package com.davis.piersqure.array.leetCode.array.string;

public class DuplicateRemovalSortedSecond {
	
	public static int removeDuplicates(int[] nums) {
       int i = 2;
       int j = 2;
       while(i<nums.length) {
    	   if(nums[i]!=nums[j-2]) {
    		   nums[j]=nums[i];
    		   j++;
    	   }
    	   i++;
       }  
       
       int[] newArr = new int[j];
       System.arraycopy(nums, 0, newArr, 0, j);
       
       for(int val:newArr) {
    	   System.out.print(val+" ");
       }
       return j;      
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {1,1,1,2,2,3};
		//output: 0,0,1,1,2,3,3
		
		System.out.println("\narray length : "+removeDuplicates(nums));
		
	}

}

/*
--------------------------------------------------------------------------------------------------------------------------------
 Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
---------------------------------------------------------------------------------------------------------------------------------
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
