package id447_NumberofBoomerangs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	 public int numberOfBoomerangs(int[][] points) {
	        int count = 0;
	        int n = points.length;
	        // 直接统计距离过来就可以
	        for (int i = 0; i < n; i++) {
	            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	            for (int j = 0; j < n; j++) {
	                int dis = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
	                if (!map.containsKey(dis)) {
	                    map.put(dis, 0);
	                }
	                //两个位置可以j k可以颠倒
	                count += map.get(dis) * 2;
	                map.put(dis, map.get(dis) + 1);
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] points = {{0,0},{1,0},{2,0}};
		int re = solution.numberOfBoomerangs(points);
		System.out.println(re);
	}
}
