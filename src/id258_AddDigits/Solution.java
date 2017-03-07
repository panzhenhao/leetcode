package id258_AddDigits;

public class Solution {
	public int addDigits(int num) {
		String temp = String.valueOf(num);
		if(temp.length()==1){
			return num;
		}
		int sum= 0;
		for (int i = 0; i < temp.length(); i++) {
			sum+= Integer.parseInt(String.valueOf(temp.charAt(i)));
		}
		return addDigits(sum);

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 2, 2, 1 };
		int num =38;
		int re = solution.addDigits(num);
		System.out.println(re);

	}
}