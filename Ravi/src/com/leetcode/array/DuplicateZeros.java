package com.leetcode.array;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		// Add a extra zero following the zero in array without altering no. sequence.
		int[] nums = { 1,0,2,3,0,4,5,0 };

		int count = 0;
		for (int i : nums) {
			if (i == 0)
				count++;
		}

		int extArr = nums.length - 1 + count;
		int len = nums.length;
		int n = nums.length - 1;

		while (n >= 0) {
			if (nums[n] == 0) {
				// System.out.println(" Whn element is 0 "+ len + " : " + extArr + " : " + n);
				if (extArr < len)
					nums[extArr] = nums[n];
				extArr--;
				if (extArr < len)
					nums[extArr] = nums[n];

			} else {

				if (extArr < len) {
					System.out.println(" Whn element is 0" + extArr + " : " + n);
					nums[extArr] = nums[n];
				}
			}
			extArr--;
			n--;
		}

		System.out.println(Arrays.toString(nums));
	}

}
