package com.leetcode.array;

import java.util.Arrays;

public class MergeSorteArray {

	static void merge(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, 0, nums1, m, n);
		Arrays.sort(nums1);
		Arrays.stream(nums1).forEach(s -> System.out.println(s));
	}

	public static void main(String[] args) {
		// tow arrays in asc order, merge them in ascending order.
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3, n = 3;
		merge( nums1,  m, nums2, n);
		// System.out.println(Arrays.toString(nums));
	}

}
