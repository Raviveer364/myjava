package com.leetcode.array;

import java.util.*;
import java.util.stream.Collectors;
public class DisappearedNum {

	public static void main(String[] args) {
		int[] nums = {1,2,4,2,5,7,1};
		List<Integer> disNums = new ArrayList<>();
		
		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		
		for (int i = 1 ; i <= nums.length; i++)
		{
			if (!set.contains(i)) {
				disNums.add(i);
			}
		}
		
		 System.out.println(disNums);
		

	}

}
