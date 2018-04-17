package Leetcode;

import Tree.BinaryTree;
import Tree.Node;

public class SymmetricTree {

	public static void main(String[] args) {
		SymmetricTree s = new SymmetricTree();
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(2);
		bt.root.left.left = new Node(3);
		bt.root.left.right = new Node(4);
		bt.root.right.left = new Node(4);
		bt.root.right.right = new Node(5);
		System.out.println(s.isSymmetric(bt.root));

	}
	
	public boolean isSymmetric(Node root) {
		if(root==null){
			return true;
		}
		else return helper(root.left,root.right);
	}

	private boolean helper(Node left, Node right) {
		if(left==null && right==null){
			return true;
		}
		if(left==null || right==null){
			return false;
		}
		return (left.data==right.data)&&helper(left.left,right.right) && helper(left.right,right.left);
		
	}

}
