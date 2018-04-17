package Leetcode;

import Tree.BinarySearchTree;
import Tree.Node;

public class GreaterTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreaterTree g = new GreaterTree();

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(2);
		bst.insert(13);


		Node root= g.convertBST(bst.root);

	}
	public Node convertBST(Node root) {
		dfs(root, 0);
		return root;
	}

	// sum   : all nodes which we have traversed thus far
	// return: root.val + sum of all nodes greater than root
	private int dfs(Node root, int sum) {
		if (root == null) return sum;
		int rsum = dfs(root.right, sum);
		root.data += rsum;
		return dfs(root.left, root.data);
	}
}
