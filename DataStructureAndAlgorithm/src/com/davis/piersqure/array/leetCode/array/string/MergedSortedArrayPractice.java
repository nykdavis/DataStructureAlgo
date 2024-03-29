package com.davis.piersqure.array.leetCode.array.string;


//150 Program: 1st Program

/*Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/


public class MergedSortedArrayPractice {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

       //Using 2 pointer approach
		
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		
		while(j>=0) {
			if(i>=0 && nums1[i]>nums2[j]) {
				nums1[k] = nums1[i];
				i--;
				k--;
			}else {
				nums1[k] = nums2[j];
				j--;
				k--;
			}
		}
        
        System.out.println("\n-------Output--------");
        for(int val:nums1) {
        	System.out.print(val+ " ");
        }
        
    }

	public static void main(String[] args) {

		 int[] nums1 = {1,2,3,0,0,0};
		 int m = 3;
		 int[] nums2 = {2,5,6};
		 int n = 3;
		 merge(nums1,m,nums2,n);
	}

}
