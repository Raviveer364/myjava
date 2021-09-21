package com.leetcode.array;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		
		int[] nums = {1,1,4,2,1,3};
		int counter = 0;
		int[] source = nums.clone();
		 Arrays.sort(nums);
		 
		 System.out.println(Arrays.toString(source));
		 System.out.println(Arrays.toString(nums));
		 for (int i = 0 ; i < nums.length ; i++)
		 {
			 if (nums[i] != source[i])
				 counter++;
		 }

		 System.out.println("Heigth mismatch is for " + counter);
	}

}
