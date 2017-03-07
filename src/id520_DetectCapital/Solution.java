package id520_DetectCapital;

//居然是4的倍数后手赢，其余的都是先手赢
public class Solution {
	public boolean detectCapitalUse(String word) {
		if(word.length()<2) return true;
		if('a'<=word.charAt(0)&&word.charAt(0)<='z'){
			for (int i = 1; i < word.length(); i++) {
				if ('a'<=word.charAt(i)&&word.charAt(i)<='z') {
				}else{
					return false;
				}		
			}
			return true;
		}else if('a'<=word.charAt(1)&&word.charAt(1)<='z'){
			for (int i = 1; i < word.length(); i++) {
				if ('a'<=word.charAt(i)&&word.charAt(i)<='z') {
				}else{
					return false;
				}
			}
			return true;
		}else{
			for (int i = 1; i < word.length(); i++) {
				if ('A'<=word.charAt(i)&&word.charAt(i)<='Z') {
				}else{
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String data = "FFFFFFFFFFFFFFFFFFFFf";
		boolean re = solution.detectCapitalUse(data);
		System.out.println(re);

	}
}