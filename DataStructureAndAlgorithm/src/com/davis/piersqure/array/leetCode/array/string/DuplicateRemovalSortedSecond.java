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
