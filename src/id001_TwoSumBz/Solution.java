package id001_TwoSumBz;

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
	 * �����ƽ�
	 * ʱ�临�Ӷ�O��N*N��
	 * �ռ临�Ӷ�O(1)
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
	 * ����hashMap����
	 * ʱ�临�Ӷ�O(n)
	 * �ռ临�Ӷ�O(n)
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
	 * һ��hashMap���룬�Ȼ���㵽����Ԫ�صĲ��ǰ���Ԫ��
	 * ʱ�临�Ӷ�O(n)
	 * �ռ临�Ӷ�O(n)
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
