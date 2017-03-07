package id448_FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		int[] temp = new int[n+1];
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			temp[nums[i]]=1;
		}
		for(int i=1; i<n+1; i++){
			if(temp[i]==0){
				list.add(i);
			}
		}
		return list;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 4,3,2,7,8,2,3,1 };
		List<Integer> re = solution.findDisappearedNumbers(data);
		System.out.println(re);

	}
}