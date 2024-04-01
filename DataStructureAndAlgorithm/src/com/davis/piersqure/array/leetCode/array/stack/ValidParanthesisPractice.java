package com.davis.piersqure.array.leetCode.array.stack;

import java.util.Stack;

//20. Valid Parentheses
//leetcode: easy : stack
public class ValidParanthesisPractice {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}

			} else if (s.charAt(i) == '}') {
				if (!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}

			} else if (s.charAt(i) == ']') {
				if (!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "()[]{}";
		System.out.println(isValid(s));

	}

}

/*
 * ---------------------- 
 * Example 1:
 * 
 * Input: s = "()"
 * Output: true 
 * ----------------------- 
 * Example 2:
 * 
 * Input: s = "()[]{}" 
 * Output: true 
 * ----------------------- 
 * Example 3:
 * 
 * Input: s = "(]" 
 * Output: false 
 * -------------------------
 */
