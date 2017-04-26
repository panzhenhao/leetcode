package id070_ClimbingStairs;

public class Solution {
	public int climbStairs(int n) {
		if (n == 0) {
			return 1;
		}

		int[] a = new int[n + 1];

		a[0] = 1;
		a[1] = 1;

		for (int i = 2; i <= n; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}

		return a[n];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int num = 7;
		int re = solution.climbStairs(num);
		System.out.println(re);

	}
}
