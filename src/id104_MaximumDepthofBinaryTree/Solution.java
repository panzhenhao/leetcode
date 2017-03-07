package id104_MaximumDepthofBinaryTree;

public class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		if (left > right)
			return (left + 1);
		return (right + 1);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] data = { 2, 2, 1 };
		int re = solution.maxDepth(null);
		System.out.println(re);

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}