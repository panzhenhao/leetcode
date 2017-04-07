package id405_ConvertaNumbertoHexadecimal;

public class Solution {
	public String toHex(int num) {
		if (num < 10 && num >= 0)
			return Integer.toString(num);
		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8 && num != 0; i++) {
			sb.insert(0, hex[num & 15]);
			num = num >> 4;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int num = 12344;
		String n = solution.toHex(num);
		System.out.println(n);
	}
}
