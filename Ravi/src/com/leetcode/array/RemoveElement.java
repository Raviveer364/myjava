package com.leetcode.array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int nums[] = {0,1,2,2,3,0,4,2};
		int val = 2 , counter = 0;
		
		for (int i=0 ; i<nums.length;i++)
		{
			if (nums[i] != val)
			{
				nums[counter] = nums[i];
				counter++;
			}
		}
		
		System.out.println("Counter is " + counter);
		System.out.println(Arrays.toString(nums));

	}

}
