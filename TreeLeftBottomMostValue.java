package Leetcode;

import Tree.BinaryTree;
import Tree.Node;

public class TreeLeftBottomMostValue {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(10);
		bt.root.left = new Node(15);
		bt.root.left.left = new Node(3);
		bt.root.left.right = new Node(6);
		bt.root.left.left.left = new Node(5);

		TreeLeftBottomMostValue sbt = new TreeLeftBottomMostValue();
		System.out.println(sbt.findBottomLeftValue(bt.root));
	}

	int ans=0, h=0;
    public int findBottomLeftValue(Node root) {
        findBottomLeftValue(root, 1);
        return ans;
    }
    public void findBottomLeftValue(Node root, int depth) {
        if (h<depth) {ans=root.data;h=depth;}
        if (root.left!=null) findBottomLeftValue(root.left, depth+1);
        if (root.right!=null) findBottomLeftValue(root.right, depth+1);
    }
		
	

}
