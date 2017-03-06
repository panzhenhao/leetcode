package id476_NumberComplement;

public class Solution {
	public int findComplement(int num) {
		int res = 1;
		int n = 0;
		int temp =num;
		while (temp != 0) {
			temp = temp/2;
			n++;
		}
		for (int i = 0; i < n; i++) {
			res = 2*res;
		}
		res=res-1;
		res= res^num;
		return res;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int num = solution.findComplement(1);
		System.out.println(num);
	}
}
