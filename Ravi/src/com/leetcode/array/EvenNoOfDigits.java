package com.leetcode.array;

public class EvenNoOfDigits {

	public static void main(String[] args) {
		// number length is even
		int[] nums = { 12, 345, 2, 6, 7896, 10 };
		int counter = 0;
		for (int i : nums) {
			if (Integer.toString(i).length() % 2 == 0)
				counter++;
		}

		System.out.println("Numbers with Even Number of Digits  - " + counter);

	}

}
