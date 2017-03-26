package id409_LongestPalindrome;

public class Solution {
	public int longestPalindrome(String s) {
		String temp= null;
		int len = 0;
		int sum = 0;
		int k =0;
		if (s.replace(String.valueOf(s.charAt(0)), "").equals("")) {
			return s.length();
		}
		while (!"".equals(temp)) {
			len = s.length();
			temp = s.replace(String.valueOf(s.charAt(0)), "");
			if ((len-temp.length())%2==0) {
				sum+=(len-temp.length());
			}else if ((len-temp.length())>1) {
				sum+=(len-temp.length()-1);
				k++;
			}else{
				k++;
			}
			s=temp;	
		}
		if (k>0) {
			return sum+1;
		}
		return sum;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String str= "aabbccs";
		int n = solution.longestPalindrome(str);
		System.out.println(n);
	}
}
