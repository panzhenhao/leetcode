package id506_RelativeRanks;

public class Solution {
	public String[] findRelativeRanks(int[] nums) {
		int len = nums.length;
		String[] re = new String[len];
		for (int i = 0; i < len; i++) {
			int count = 1;
			for (int j = 0; j < len; j++) {
				if (i != j && nums[i] < nums[j]) {
					count++;
				}
			}
			if(count==1){
				re[i] = "Gold Medal";
			}else if(count==2){
				re[i] = "Silver Medal";
			}else if(count==3){
				re[i] = "Bronze Medal";
			}else{
				re[i] = String.valueOf(count);
			}
		}
		return re;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 2, 4, 12, 6, 7 };
		String[] re = solution.findRelativeRanks(data);
		for (int i = 0; i < re.length; i++) {
			System.out.println(re[i]);
		}
	}
}
