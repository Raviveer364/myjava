package com.leetcode.array;

import java.util.Arrays;

public class SqureOfSortedArray {

	public static void main(String[] args) {

		int[] nums = { -4, -1, 0, 3, 10 };
		int[] resArr = new int[nums.length];
		int left = 0, right = nums.length - 1;
		// Input Arrays is always sorted, So i can use Absolute number square to find the
		// order of number in reverse.
		for (int i = nums.length - 1; i >= 0; i--) {

			if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
				// System.out.println("Upper");
				resArr[i] = nums[left] * nums[left];
				left++;
			} else {
				// System.out.println("lower");
				resArr[i] = nums[right] * nums[right];
				right--;
			}

		}

		System.out.println(Arrays.toString(resArr));

	}

}
