package id496_NextGreaterElementI;

public class Solution {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int len = findNums.length;
		int[] res = new int[len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (findNums[i] == nums[j]) {
					int k = j + 1;
					for (; k < nums.length; k++) {
						if (nums[k] > findNums[i]) {
							res[i] = nums[k];
							break;
						}
					}
					if (k == nums.length) {
						res[i] = -1;
					}
				}

			}
		}
		return res;
	}

	public int[] nextGreaterElement2(int[] findNums, int[] nums) {
		int len = findNums.length;
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			int j = 0, flag = 0, length = nums.length;
			for (; j < length; j++) {
				if (flag == 0 && nums[j] == findNums[i])
					flag = 1;
				if (flag == 1 && nums[j] > findNums[i]) {
					result[i] = nums[j];
					break;
				}
			}
			if (j == length)
				result[i] = -1;
		}
		return result;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] findNums = { 2, 4 };
		int[] nums = { 1, 2, 3, 4 };
		int[] re = solution.nextGreaterElement(findNums, nums);
		for (int i = 0; i < re.length; i++) {
			System.out.println(re[i]);
		}
	}
}
