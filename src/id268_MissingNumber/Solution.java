package id268_MissingNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int missingNumber(int[] nums) {
		int len = nums.length;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		for (int i = 0; i<=len; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 0, 1, 3};
		int re = solution.missingNumber(data);
		System.out.println(re);

	}
}