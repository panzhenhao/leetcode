package id292_NimGame;

//居然是4的倍数后手赢，其余的都是先手赢
public class Solution {
	public boolean canWinNim(int n) {
		if(n%4==0){
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int data = 5;
		boolean re = solution.canWinNim(data);
		System.out.println(re);

	}
}