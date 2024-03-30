package com.davis.piersqure.array.leetCode.array.string;

public class DuplicateRemovalSortedSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {0,0,1,1,1,1,2,3,3};
		//output: 0,0,1,1,2,3,3
		
		int index =0;
		for(int i =0 ; i< arr.length; i++) {
			if(arr[index]!= arr[i]) {		
				arr[++index]=arr[i];
			}
		}
		
		
		int []newArr = new int[index+1];
		System.arraycopy(arr, 0, newArr, 0, index+1);
		
		for(int a:newArr) {
			System.out.print(a+ " ");
		}
		
	}

}
