package id350_IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> re = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums2.length; i++) {
			Integer key = nums2[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}
		}
		for (int i = 0; i < nums1.length; i++) {
			Integer key = nums1[i];
			if (!map.isEmpty()&&map.containsKey(key)) {
				if(map.get(key)-1==0){
					re.add(key);
					map.remove(key);
				}else {
					re.add(key);
					map.put(key, map.get(key)-1);
				}
			}
		}
		if (re.size()>0) {
			int[] rs = new int[re.size()];
			for (int i = 0; i < rs.length; i++) {
				rs[i] = re.get(i);
			}
			return rs;	
		} 
		return new int[0];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = { 1, 2, 3, 2, 1 };
		int[] nums2 = { 2, 2, 3 };
		int[] re = solution.intersect(nums1, nums2);
		for (int i = 0; i < re.length; i++) {
			System.out.println(re[i]);
		}
	}
}
