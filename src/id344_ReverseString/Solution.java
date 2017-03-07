package id344_ReverseString;

public class Solution {
	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		int len = s.length();
		for (int i = len-1; i > -1; i--) {
			sb.append(String.valueOf(s.charAt(i)));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String str = "hello";
		String re = solution.reverseString(str);
		System.out.println(re);
	}
}
