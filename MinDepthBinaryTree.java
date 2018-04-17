package Leetcode;

public class MinDepthBinaryTree {
	//get no. of nodes between root and leaf node on shortest path
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		//if both left and right present..then get min height
		if (root.left != null && root.right != null)
			return Math.min(minDepth(root.left), minDepth(root.right))+1;
		//if one side null, ie only left sub tree present, we can't consider right null node
		// since then it would get distance between root to root (0) and root is not leaf node
		// so get max
		else
			return Math.max(minDepth(root.left), minDepth(root.right))+1;
	}
}
