package Leetcode;

public class DiamtrOFBinaryTree {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		TreeNode bt = new TreeNode(3);
		bt.left = new TreeNode(9);
		bt.right = new TreeNode(20);
		bt.right.left = new TreeNode(15);
		bt.right.right = new TreeNode(7);
		bt.right.right.right = new TreeNode(1);
		//bt.right.right.right.left = new TreeNode(1);

		DiamtrOFBinaryTree b = new DiamtrOFBinaryTree();
		System.out.println(b.diameterOfBinaryTree(bt));
	
		// TODO Auto-generated method stub

	}
	 public int diameterOfBinaryTree(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        int lHeight = getHeight(root.left);
			int rHeight = getHeight(root.right);
	        int d=lHeight+rHeight;
	        int temp= Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
	        return d > temp ? d :temp;
	    }
	    
	    private int getHeight(TreeNode root){
			if(root==null){
				return 0;
			}
			return 1+Math.max(getHeight(root.left),getHeight(root.right));
		}
}
