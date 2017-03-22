package id122_BestTimetoBuyandSellStockII;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length<2) {
			return 0;
		}
		int re = 0;
		int max = prices[0];
		int min = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > max) {
				max = prices[i];
			} else {
				re += max - min;
				max = min = prices[i];
			}
		}
		re += max - min;
		return re;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = { 1, 2, 3, 2, 7 };
		int re = solution.maxProfit(nums1);
		System.out.println(re);
	}
}
