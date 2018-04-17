package Leetcode;

import Tree.BinaryTree;
import Tree.HeightOfBinaryTree;
import Tree.Node;

public class SubTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		bt.root = new Node(3);
		bt.root.left = new Node(4);
		bt.root.right = new Node(5);
		bt.root.left.left = new Node(1);
		bt.root.left.right = new Node(2);
		//bt.root.left.right = new Node(0);

		BinaryTree bt2 = new BinaryTree();
		bt2.root = new Node(4);
		bt2.root.left = new Node(1);
		bt2.root.right = new Node(2);
		
		SubTree sbt = new SubTree();
		System.out.println(sbt.isSubtree(bt.root,bt2.root));
	

	}
	public boolean isSubtree(Node root, Node root2) {
        if (root == null) return false;
        if (isSame(root, root2)) return true;
        return isSubtree(root.left, root2) || isSubtree(root.right, root2);
    }
    
    private boolean isSame(Node root, Node root2) {
        if (root == null && root2 == null) return true;
        if (root == null || root2 == null) return false;
        
        if (root.data != root2.data) return false;
        
        return isSame(root.left, root2.left) && isSame(root.right, root2.right);
    }

}
