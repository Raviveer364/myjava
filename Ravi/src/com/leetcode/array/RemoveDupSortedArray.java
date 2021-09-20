package com.leetcode.array;

public class RemoveDupSortedArray {

	static int removeDuplicates(int[] nums) {
        
        if (nums.length == 0 )
			return 0;
		
		int counter = 1;
		
		for (int i = 1; i < nums.length; i++) {
			
			if (nums[i] != nums[i-1]) {
				
				nums[counter] = nums[i];
				counter++;
			}			
		}
		
		//System.out.println(Arrays.toString(nums));
		return counter;
    }
	
	public static void main(String[] args) {
		//Remove duplicate from sorted array 
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}

}
