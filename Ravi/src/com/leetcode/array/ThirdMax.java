package com.leetcode.array;

import java.util.Arrays;
import java.util.Collections;

public class ThirdMax {

	public static void main(String[] args) {
		
		int[] nums = {3,2,1};
		
		int result = fnThirdMax(nums);
		
		System.out.println("Max no is at " + result + " -> " + nums[result]);

	}

	private static int fnThirdMax(int[] nums) {		
		int max = nums.length - 1, counter = 1;
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] != nums[i - 1]) {
				counter++;
			}
			if (counter == 3)
				max = i-1;
		}

		return nums[max];		
		
	}

}
