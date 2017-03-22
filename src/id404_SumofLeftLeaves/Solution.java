package id404_SumofLeftLeaves;

public class Solution {
	
	public int sumOfLeftLeaves(TreeNode root) {
		int sum=0;
		if (root==null) {
			return 0;
		}if (root.left!=null&&root.left.left==null&&root.left.right==null) {
			 sum = root.left.val;
		}
		sum += sumOfLeftLeaves(root.left);
		sum += sumOfLeftLeaves(root.right);
		return sum;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode root = new TreeNode(1);
		TreeNode temp = root;
		temp.left = new TreeNode(2);
		temp.right = new TreeNode(3);
		temp = temp.left;
		temp.left = new TreeNode(4);
		temp.right = new TreeNode(5);
		int re = solution.sumOfLeftLeaves(root);
		System.out.println(re);
	}
	
}

