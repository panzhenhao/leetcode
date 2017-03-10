package id283_MoveZeroes;

public class Solution {
	public void moveZeroes(int[] nums) {
		int current = 0;
		for (int i = 0; i < nums.length; i++) {
			if (current != nums.length) {
				if (nums[i] == 0) {
					if(current<=i){
						current=i+1;
					}
					for (; current < nums.length;) {
						if (nums[current] != 0) {
							nums[i] = nums[current];
							nums[current] = 0;
							current++;
							break;
						}
						current++;
					}
				}

			}else{
				nums[i] = 0;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+"  ");
		} 

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 1, 12, 0, 5, 4, 33 };
		solution.moveZeroes(data);
		// System.out.println(re);

	}
}