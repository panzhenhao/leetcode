package id415_AddStrings;

public class Solution {
	public String addStrings(String num1, String num2) {
		if (num1 == null || "".equals(num1)) {
			return num2;
		} else if (num2 == null || "".equals(num2)) {
			return num1;
		}
		int len1 = num1.length();
		int len2 = num2.length();
		int minlen = Math.min(len1, len2);
		int i = len1 - 1;
		int j = len2 - 1;
		int sum = 0;
		int c = 0;
		StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		while (minlen > 0) {
			sum = c + (num1.charAt(i) - '0') + (num2.charAt(j) - '0');
			c = sum / 10;
			result.append(sum % 10 + "");
			i--;
			j--;
			minlen--;
		}
		while (i != -1) {
			sum = c + (num1.charAt(i) - '0');
			c = sum / 10;
			result.append(sum % 10 + "");
			i--;
		}
		// 当num2较长
		while (j != -1) {
			sum = c + (num2.charAt(j) - '0');
			c = sum / 10;
			result.append(sum % 10 + "");
			j--;
		}
		if (i == -1 && j == -1 && c != 0) {
			result.append(c+ "");
		}
		for (int k = result.length()-1; k >=0; k--) {
			sb.append(result.charAt(k));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String num1 = "123";
		String num2 = "9999";
		String re = solution.addStrings(num1, num2);
		System.out.println(re);
	}
}
