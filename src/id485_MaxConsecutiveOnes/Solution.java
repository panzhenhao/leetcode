package id485_MaxConsecutiveOnes;

public class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count =0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1){
				count++;
				if(count>max){
					max=count;
				}
			}else{
				count = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 1, 1, 0, 1, 1, 1 };
		int re = solution.findMaxConsecutiveOnes(data);
		System.out.println(re);

	}
}