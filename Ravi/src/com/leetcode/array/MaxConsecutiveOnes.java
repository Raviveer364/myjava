package com.leetcode.array;

public class MaxConsecutiveOnes {

	   public static int findMaxConsecutiveOnes(int[] nums) {
	        
	        int counter = 0 , max1 = 0; 
			 
			 for (int a = 0 ; a < nums.length; a++)
			 {
				 if (nums[a] == 1 )
				 {
				 counter = counter + 1; 
				 if (counter >= max1)
				 {
					 max1 = counter; 
				 }
				 }
				 else		     
			     counter = 0;	
			 }
			 
			 return max1;
	    }
	   
	public static void main(String[] args) {
		// Max consecutive no. of ones
		int[] nums = {1,1,0,1,1,1,0,0,1,1,1,1,1,1,1,0,0,0,1,1,0};
		System.out.println(findMaxConsecutiveOnes(nums));

	}

}
