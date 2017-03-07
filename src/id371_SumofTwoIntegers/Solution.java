package id371_SumofTwoIntegers;

public class Solution {
	public int getSum(int a, int b) {
		if(a == 0) return b;

	    int x = a ^ b;
	    int c = (a & b) << 1;
		return getSum(c, x);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 2, 2, 1 };
		int a =5,b =4;
		int re = solution.getSum(a,b);
		System.out.println(re);

	}
}