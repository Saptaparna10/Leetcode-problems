package Leetcode;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode bt = new TreeNode(3);
		bt.left = new TreeNode(9);
		bt.right = new TreeNode(20);
		bt.right.left = new TreeNode(15);
		bt.right.right = new TreeNode(7);
		bt.right.right.right = new TreeNode(1);
		//bt.right.right.right.left = new TreeNode(1);

		BalancedBinaryTree b = new BalancedBinaryTree();
		System.out.println(b.isBalanced(bt));
	}

	public boolean isBalanced(TreeNode root) {
		if(root==null){
			return true;
		}
		if(root.left==null && root.right==null){
			return true;
		}
		int lHeight = getHeight(root.left);
		int rHeight = getHeight(root.right);
		if(Math.abs(lHeight-rHeight)>1){
			return false;
		}
		
		return isBalanced(root.left)&&isBalanced(root.right);
	}
	private int getHeight(TreeNode root){
		if(root==null){
			return 0;
		}
		return 1+Math.max(getHeight(root.left),getHeight(root.right));
	}
}
