package id136_SingleNumber;

public class Solution {
	public int singleNumber(int[] nums) {
		if(nums.length==1) return nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int j = i+1;
				for (; j < nums.length; j++) {
					if (nums[i]==nums[j]) {
						nums[i]=nums[j]=0;
						break;
					}
				}
				if(j==nums.length&&nums[i]!=nums[j-1]){
					return nums[i];
				}
			}
		}
		return nums[nums.length-1];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 2, 2, 1 };
		int re = solution.singleNumber(data);
		System.out.println(re);

	}
}