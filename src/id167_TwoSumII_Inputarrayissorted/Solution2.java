package id167_TwoSumII_Inputarrayissorted;

public class Solution2 {
	public int[] twoSum(int[] numbers, int target) {
		
			for (int i = 0; i < numbers.length; i++) {
				int num = target-numbers[i];
				for (int j = i+1 ; j < numbers.length; j++) {
					if (num==numbers[j]) {
						return new int[]{i+1,j+1};
					}
				}
			}
		return null;
	}

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		int[] data = { 1,2,3,4,4,9,56,90};
		int[] re = solution.twoSum(data, 8);
		System.out.println(re[0]+"  "+re[1]);

	}
}