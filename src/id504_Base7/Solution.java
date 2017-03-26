package id504_Base7;

public class Solution {
	public String convertToBase7(int num) {
		if(num<0){
			return "-"+(Integer.toString(-num, 7));
		}
		return Integer.toString(num, 7);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int num = -7;
		String re= solution.convertToBase7(num);

		System.out.println(re);

	}
}
