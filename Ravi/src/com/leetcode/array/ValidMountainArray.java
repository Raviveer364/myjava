package com.leetcode.array;

public class ValidMountainArray {

	 public static boolean validMountainArray(int[] arr) {
	        // Mountain array
	        int start = 0 , end = arr.length - 1;
			
			while (start < end )
			{
				if (arr[start+1] > arr[start])
					start++;
				else if (arr[end-1]>arr[end])
					end--;
				else 
					break;
				
			}
			
			return start != 0 && end != arr.length - 1 && start==end;
	    }
	 
	public static void main(String[] args) {
		int[] arr = {0,3,2,1};
		System.out.println(validMountainArray(arr));
	}

}
