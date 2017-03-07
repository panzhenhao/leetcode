package id003_LongestSubstringWithoutRepeatingCharacters;
/**
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class Solution {
	/*
	 	Given "abcabcbb", the answer is "abc", which the length is 3.
	 	Given "bbbbb", the answer is "b", with the length of 1.
	 	Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
	 */
	public int lengthOfLongestSubstring(String s) {
		String sub = "";
		String result = "";
		int subLength=0;
		for (int i = 0; i < s.length(); i++) {
			String c = "" + s.charAt(i);
			if (sub.contains(c)) {
				if (sub.length() > result.length()) {
					result = sub;
				}
				subLength=sub.length();
				for(int j=0;j<subLength;j++){
					sub = sub.substring(1, sub.length());
					if(!sub.contains(c)){
						sub +=c;
						break;
					}
				}
			} else {
				sub += c;
			}
		}
		if (sub.length() > result.length()) {
			result = sub;
		}
		return result.length();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int length = solution.lengthOfLongestSubstring("yfsrsrpzuya");
		System.out.println(length);
	}

}
