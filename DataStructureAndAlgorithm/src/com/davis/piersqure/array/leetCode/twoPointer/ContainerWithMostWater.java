package com.davis.piersqure.array.leetCode.twoPointer;

//11. Container With Most Water
//Leet code: Medium: Two Pointer
public class ContainerWithMostWater {
	
	 public static int maxArea(int[] height) {
	        int l = 0,r = height.length-1;
	        int maxArea=0;
	        while(l<r) {
	        	int currentArea = Math.min(height[l], height[r])*(r-l);
	        	maxArea = Math.max(maxArea, currentArea);
	        	if(height[l]<height[r]) l++;
	        	else r--;
	        }
	        return maxArea;
	    }

	public static void main(String[] args) {
		int[] arr= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));

	}

}

//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
//In this case, the max area of water (blue section) the container can contain is 49.
