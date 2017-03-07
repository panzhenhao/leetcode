package id001_TwoSum;
/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 */
public class Solution {
	/*
	 Example:
	  	Given nums = [2, 7, 11, 15], target = 9,
	 	Because nums[0] + nums[1] = 2 + 7 = 9,
		return [0, 1].
	 */
	public int[] twoSum(int[] nums, int target) {
		int temp;
		int[] re = new int[2];
		for(int i=0;i<nums.length;i++){
			temp = target-nums[i];
			for(int j=i+1;j<nums.length;j++){
				if (temp==nums[j]) {
					re[0]=i;
					re[1]=j;
					return re;
				}
			}
			
		}
		
		return re;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums={0,1,2,3,4,5};
		nums=solution.twoSum(nums,4);
		System.out.println(nums[0]+" "+nums[1]);

	}

}
