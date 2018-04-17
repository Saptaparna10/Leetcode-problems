package Leetcode;

public class InvertBinaryTree {

	public static void main(String[] args) {
		
		TreeNode bt = new TreeNode(4);
		bt.left = new TreeNode(7);
		bt.right = new TreeNode(2);
		/*bt.left.left = new TreeNode(9);
		bt.left.right = new TreeNode(6);
		bt.right.left = new TreeNode(3);
		bt.right.right = new TreeNode(1);*/
		

		InvertBinaryTree b = new InvertBinaryTree();
		TreeNode rootRes=b.invertTree(bt);	
		System.out.println(rootRes);

	}
	public TreeNode invertTree(TreeNode root) {
		if(root==null){
			return null;
		}
		TreeNode left=root.left;
		root.left=invertTree(root.right);
		root.right=invertTree(left);
		return root;
	}

}
