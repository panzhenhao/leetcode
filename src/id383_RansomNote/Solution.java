package id383_RansomNote;

public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		if (magazine == null) {
			return false;
		}
		if (magazine.contains(ransomNote)) {
			return true;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			char ch = ransomNote.charAt(i);
			int index = magazine.indexOf(String.valueOf(ch));
			if (index == -1) {
				return false;
			}
			magazine=magazine.replaceFirst(String.valueOf(ch), "");
		}
		return true;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String a = "fffbfg";
		String b = "effjfggbffjdgbjjhhdegh";
		boolean re = solution.canConstruct(a, b);
		System.out.println(re);

	}
}