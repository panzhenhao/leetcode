package id242_ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public boolean isAnagram1(String s, String t) {
		if (s.length()!=t.length()) {
			return false;
		}
		int index;
		for (int i = 0; i < s.length(); i++) {
			index = t.indexOf(String.valueOf(s.charAt(i)));
			if (index==-1) {
				return false;
			}else{
				t=t.replaceFirst((String.valueOf(s.charAt(i))),"");
			}
		}
		return true;
	}

	public boolean isAnagram(String s, String t) {
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();

		Arrays.sort(sArr);
		Arrays.sort(tArr);

		return String.valueOf(sArr).equals(String.valueOf(tArr));
	}  
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s = "anagram";
		String t = "nagaram";
		boolean re = solution.isAnagram(s, t);
		System.out.println(re);
	}
}