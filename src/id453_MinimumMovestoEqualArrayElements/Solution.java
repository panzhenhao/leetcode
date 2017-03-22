package id453_MinimumMovestoEqualArrayElements;

public class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];  
        int sum = nums[0];  
        for (int i = 1; i < nums.length; i++) {  
            if (nums[i] < min) {  
                min = nums[i];  
            }  
            sum += nums[i];  
        }  
        return sum - min * nums.length;  
    }
    
    public static void main(String[] args){
    	Solution solution = new Solution();
    	int[] nums = {1,2,4};
    	int re = solution.minMoves(nums);
    	System.out.println(re);
    }
}