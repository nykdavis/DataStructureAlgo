package com.davis.piersqure.sorting;


// Time Complexity (O(n log n)):
// Space Complexity (O(n));
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {23,12,45,3,6,9,18,33};
		
		System.out.println("Given array is");
		print(arr);
		
		MergeSort obj = new MergeSort();
		obj.sort(arr,0,arr.length-1);

		System.out.println("\nAfter sorting.");
		print(arr);
	}

	private void sort(int[] arr, int l, int r) {
		if(l < r) {
			int m = l+(r-l)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			mergeSort(arr,l,m,r);
			}
		
	}

	private void mergeSort(int[] arr, int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2 = r-m;
		
     	int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0; i<n1; ++i) {
			L[i] = arr[l+i];
		}
		for(int j=0; j<n2; ++j) {
			R[j] = arr[m+1+j];
		}
		
		
		int i=0,j=0;
		int k= l;
		
        while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
			    arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
        while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
       
	}

	private static void print(int[] arr) {
		for(int value:arr) {
			System.out.print(value + " ");
		}
		
	}

}
