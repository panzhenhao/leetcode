package id169_MajorityElement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int temp=1;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				temp = map.get(nums[i]) + 1;
				if (temp>nums.length/2) {
					return nums[i];
				}
				map.put(nums[i], temp);
			}else{
				if (temp>nums.length/2) {
					return nums[i];
				}
				map.put(nums[i], 1);
			}
		}
		for (int i = 0; i < nums.length; i++) {
			
		}
		return 0;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 6,5,5 };
		int re = solution.majorityElement(data);
		System.out.println(re);
	}
}