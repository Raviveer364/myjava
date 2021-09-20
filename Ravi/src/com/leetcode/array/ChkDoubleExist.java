package com.leetcode.array;

import java.util.HashSet;

public class ChkDoubleExist {

	 static  boolean checkIfExist(int[] arr) {
	        
	        HashSet<Integer> mySet = new HashSet<>();
			
			for (int i : arr)
			{
				if (mySet.contains(i*2) || ( i%2 == 0 && mySet.contains(i/2)))
				{
					return true;				
				}
	            mySet.add(i);
			}

			return false;
	    }
	 
	public static void main(String[] args) {
		// Check of double number (num*2 or num/2 in loop)
		int[] arr = {7,1,14,11};
		System.out.println(checkIfExist(arr));
	}

}
