package com.leetcode.array;

public class MoveZerosRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		int counter = 0;
		
		if (nums == null || nums.length == 0 )
		    counter = 0;
		
		for (int i = 0 ; i<nums.length; i++)
		{
			if (nums[i] == 0)
				counter++;
			else 
			{
				nums[i - counter] = nums[i];
				if (counter > 0)
					nums[i] = 0;
			}
		}
	}

}
