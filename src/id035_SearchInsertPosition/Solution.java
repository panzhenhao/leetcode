package id035_SearchInsertPosition;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		if(nums == null || nums.length == 0)  
	    {  
	        return 0;  
	    }  
	    int l = 0;  
	    int r = nums.length-1;  
	    while(l<=r)  
	    {  
	        int mid = (l+r)/2;  
	        if(nums[mid]==target)  
	            return mid;  
	        if(nums[mid]<target)  
	            l = mid+1;  
	        else  
	            r = mid-1;  
	    }  
	    return l;  
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = {1,3,5,6};
		int re = solution.searchInsert(data,4);
		System.out.println(re);
	}
}
