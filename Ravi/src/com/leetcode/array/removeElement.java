package com.leetcode.array;

import java.util.Arrays;

public class removeElement {

	public static void main(String[] args) {
		// Remove a specific element in array.
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 3;
		int m = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[m] = nums[i];
				m++;
			}
		}
		System.out.println(Arrays.toString(nums));

	}

}
