package id349_IntersectionofTwoArrays;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> re = new HashSet<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if (re.contains(nums2[i])) {
				continue;
			}
			for (int j = 0; j < nums1.length; j++) {
				if (nums2[i] == nums1[j]) {
					re.add(nums2[i]);
				}
			}
		}

		int[] reNums = new int[re.size()];
		int i = 0;
		for (Integer temp : re) {
			reNums[i++] = temp;
		}
		return reNums;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = { 1, 2, 3,2, 1 };
		int[] nums2 = { 2, 2 ,3 };
		int[] re = solution.intersection(nums1, nums2);
		for (int i = 0; i < re.length; i++) {
			System.out.println(re[i]);
		}
	}
}
