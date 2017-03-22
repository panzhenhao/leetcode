package id387_FirstUniqueCharacterinaString;

public class Solution {
	public int firstUniqChar(String s) {
		int len = s.length();
		int index = -1;
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (s.indexOf(ch)==s.lastIndexOf(ch)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String a = "cc";
		int re = solution.firstUniqChar(a);
		System.out.println(re);

	}
}