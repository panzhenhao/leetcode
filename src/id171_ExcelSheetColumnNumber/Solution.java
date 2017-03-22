package id171_ExcelSheetColumnNumber;

public class Solution {
	public int titleToNumber(String s) {
		int len = s.length();
		int num = 0;
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			int m = 1;
			for (int j = i+1; j < len; j++) {
				m *= 26;
			}
			num+= m*(int)(ch-'A'+1);
		}
		return num ;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String a = "BA";
		int re = solution.titleToNumber(a);
		System.out.println(re);

	}
}