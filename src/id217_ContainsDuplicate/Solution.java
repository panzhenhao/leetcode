package id217_ContainsDuplicate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
	public boolean containsDuplicate(int[] nums) {
//		if (nums.length==0) {
//			return false;
//		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		for (Integer key : map.keySet()) {
			if (map.get(key)>1) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { };
		boolean n = solution.containsDuplicate(data);
		System.out.println(n);
	}
}
