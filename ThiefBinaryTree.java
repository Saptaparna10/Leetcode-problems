package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;
import javax.xml.namespace.QName;

public class ThiefBinaryTree {

	public static void main(String args[]){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(1);

		ThiefBinaryTree th = new ThiefBinaryTree();
		System.out.println(th.rob(root));
	}

	public int rob(TreeNode root) {
	    if (root == null) return 0;
	    return Math.max(robInclude(root), robExclude(root));
	}

	public int robInclude(TreeNode node) {
	    if(node == null) return 0;
	    return robExclude(node.left) + robExclude(node.right) + node.val;
	}

	public int robExclude(TreeNode node) {
	    if(node == null) return 0;
	    return rob(node.left) + rob(node.right);
	}
}


