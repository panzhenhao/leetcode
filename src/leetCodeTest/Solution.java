package leetCodeTest;


/**
 * Given a positive integer n and you can do operations as follow:
 * If n is even, replace n with n/2.
 * If n is odd, you can replace n with either n + 1 or n - 1.
 * What is the minimum number of replacements needed for n to become 1?
 */

/*	Example 1:
 		Input: 8
 		Output:3
		Explanation:8 -> 4 -> 2 -> 1
	Example 2:
		Input:7
		Output:4
		Explanation:7 -> 8 -> 4 -> 2 -> 1 or 7 -> 6 -> 3 -> 2 -> 1
 */
public class Solution {
	public int integerReplacement(int n) {
		if (n == 0)
			return 1;
		else if (n == 1)
			return 0;
		else if (n % 2 == 0) {
			n = n / 2;
			return integerReplacement(n)+1;
		} else {
			if (n == Integer.MAX_VALUE) {
				return integerReplacement(n-1)+1;
			} else {
				return Math.min(integerReplacement(n-1)+1, integerReplacement(n + 1)+1);
			}
		}

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int n = solution.integerReplacement(Integer.MAX_VALUE);
		System.out.println(n);
	}
}
