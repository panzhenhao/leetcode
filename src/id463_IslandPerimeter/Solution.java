package id463_IslandPerimeter;

public class Solution {
	 public int islandPerimeter(int[][] grid) {
	       if(grid == null || grid.length == 0){
	           return  0;
	       }
	       int cnt = 0;
	       for(int i = 0 ; i < grid.length; i++){
	           for(int j = 0; j < grid[0].length ; j++){
	               if(grid[i][j] == 1) {
	                   cnt += grid[i][j] * 4;
	                   if(i > 0 && grid[i-1][j] == 1)
	                     cnt = cnt - 1;
	                   if(j > 0 && grid[i][j-1] == 1)
	                     cnt = cnt - 1; 
	                   if(i < grid.length - 1 && grid[i+1][j] == 1)
	                     cnt = cnt - 1;
	                   if(j < grid[0].length - 1 && grid[i][j+1] == 1)
	                     cnt = cnt - 1;
	               }
	           }
	       }
	       return cnt;
	    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] grid = { { 1 }, { 0 } };
		int re = solution.islandPerimeter(grid);
		System.out.println(re);

	}
}