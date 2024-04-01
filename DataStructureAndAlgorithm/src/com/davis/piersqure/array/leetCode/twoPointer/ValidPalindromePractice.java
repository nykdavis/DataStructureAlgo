package com.davis.piersqure.array.leetCode.twoPointer;


//Valid Palindrome
//leetcode: 125 : Easy    25/150
public class ValidPalindromePractice {
	
	public static boolean  isPalindrome(String s) {
        s = s.replaceAll("\\W", "").toLowerCase();
        System.out.println(s);
        int left = 0;
        int right = s.length()-1;
        while(left<right) {
        	if(s.charAt(left) != s.charAt(right)) {
        		return false;
        	}
        	left++;
        	right--;
        }
       return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "A man, a plan, a canal: Panama";
		//String s = "race a car";
		//String s = "aaa";
		String s = "ab_a";
		System.out.println(isPalindrome(s));
		
	}

}
