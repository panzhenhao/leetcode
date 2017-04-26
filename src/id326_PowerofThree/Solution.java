package id326_PowerofThree;

public class Solution {
	public boolean isPowerOfThree(int n) {
		if (n == 1)
			return true;
		else if (n == 0)
			return false;
		else if (n % 3 == 0)
			return isPowerOfThree(n / 3);
		else
			return false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int data = 5;
		boolean re = solution.isPowerOfThree(6);
		System.out.println(re);

	}
}