package id1_TwoSumBz;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 */
/*
Example:
 	Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
*/
public class Solution {
	/*
	 * 暴力破解
	 * 时间复杂度O（N*N）
	 * 空间复杂度O(1)
	 */
	public int[] twoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	/*
	 * 两段hashMap代码
	 * 时间复杂度O(n)
	 * 空间复杂度O(n)
	 */
	public int[] twoSum2(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	/*
	 * 一段hashMap代码，先会计算到后面元素的差，求前面的元素
	 * 时间复杂度O(n)
	 * 空间复杂度O(n)
	 */
	public int[] twoSum3(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums={0,1,2,2,2,5};
		nums=solution.twoSum3(nums,6);
		System.out.println(nums[0]+" "+nums[1]);

	}

}
