package com.davis.piersqure.array.leetCode.array.string;

import java.util.HashMap;
import java.util.Map;

//Roman to Integer: LeetCode:13/150
public class RomanToIntegerPractice {

	public static int romanToInt(String s) {
		Map<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);

		String[] inputArr = s.split("");
		int value = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (i > 0 && map.get(inputArr[i - 1]) < map.get(inputArr[i])) {
				value = value + map.get(inputArr[i]);
				value = value - (2 * map.get(inputArr[i - 1]));
			} else {
				value = value + map.get(inputArr[i]);
			}
		}
		return value;
	}

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
}
/*-------------------------------------------------------
Example 1:                                            -
Input: s = "III"                                      -
Output: 3                                             -
Explanation: III = 3.                                 -
-------------------------------------------------------
Example 2:                                            -
                                                      -
Input: s = "LVIII"                                    -
Output: 58                                            -
Explanation: L = 50, V= 5, III = 3.                   -
-------------------------------------------------------
Example 3:                                            -
                                                      -
Input: s = "MCMXCIV"                                  -
Output: 1994                                          -
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.  -
-------------------------------------------------------*/