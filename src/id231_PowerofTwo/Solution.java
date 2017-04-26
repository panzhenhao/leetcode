package id231_PowerofTwo;

public class Solution {
	public boolean isPowerOfTwo(int n) {
		if (n == 1)
			return true;
		else if (n == 0)
			return false;
		else if (n % 2 == 0)
			return isPowerOfTwo(n / 2);
		else
			return false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int data = 5;
		boolean re = solution.isPowerOfTwo(8);
		System.out.println(re);

	}
}