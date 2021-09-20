package com.leetcode.array;

import java.util.Arrays;

public class GreatestElementOnRight {

	public static int[] replaceElements(int[] arr) {

		int mx = -1, temp;
		for (int i = arr.length - 1; i >= 0; i--) {
			temp = arr[i];
			arr[i] = mx;
			mx = Math.max(mx, temp);

		}

		return arr;
	}

	public static void main(String[] args) {
		// replace number with greatest no. on right
		int[] arr = {17,18,5,4,6,1};
		replaceElements(arr);
		System.out.println(Arrays.toString(arr));
	}

}
