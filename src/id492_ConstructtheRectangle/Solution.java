package id492_ConstructtheRectangle;

public class Solution {
	public int[] constructRectangle(int area) {
		int mid = (int)Math.sqrt(area);
		int[] lw = new int[2];
		for(;mid>0;mid--){
			if (area%mid==0) {
				lw[1] = mid;
				lw[0] = area/mid;
				break;
			}
		}
		return lw;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 1, 1, 0, 1, 1, 1 };
		int[] re = solution.constructRectangle(6);
		System.out.println(re[0]+"  "+re[1]);

	}
}