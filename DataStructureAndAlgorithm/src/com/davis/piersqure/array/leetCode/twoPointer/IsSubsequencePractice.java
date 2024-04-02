package com.davis.piersqure.array.leetCode.twoPointer;

//392. Is Subsequence
//LeetCode problem: easy: two pointer
public class IsSubsequencePractice {
	// s = "abc", t = "ahbgdc" true
	// s = "axc", t = "ahbgdc" false
	public static boolean isSubsequence(String s, String t) {
		int i = 0;
		int j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i == s.length();
	}

	public static void main(String[] args) {
		String s = "", t = "c";
		System.out.println(isSubsequence(s, t));
	}

}
