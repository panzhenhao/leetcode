package id202_HappyNumber;

import java.util.HashSet;

public class Solution {
	 public boolean isHappy(int n) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        int sum = 0;
	        while(true)
	        {
	            if(n == 1)
	                return true;
	            while(n>0)
	            {
	                int r = n%10;
	                sum += r*r;
	                n = n/10;
	            }
	            if(!set.add(sum))
	                return false;
	            n = sum;
	            sum = 0;
	        }
	    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		boolean re = solution.isHappy(19);
		System.out.println(re);

	}
}