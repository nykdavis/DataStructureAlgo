package com.davis.piersqure.array.leetCode.array.string;


//58. Length of Last Word
public class LastLengthOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "luffy is still joyboy";
		String[] arr=s.split(" ");
		System.out.println(arr[arr.length-1].length());
	}

}
