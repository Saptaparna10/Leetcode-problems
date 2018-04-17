package Leetcode;

public class MergeBinaryTree {

	public static void main(String[] args) {
		MergeBinaryTree m =new MergeBinaryTree();
		TreeNode t1=new TreeNode(1);
		t1.left=new TreeNode(3);
		t1.right=new TreeNode(2);
		t1.left.left=new TreeNode(5);

		TreeNode t2=new TreeNode(2);
		t2.left=new TreeNode(1);
		t2.right=new TreeNode(3);
		t2.left.right=new TreeNode(4);
		t2.right.right=new TreeNode(7);

		TreeNode res=m.mergeTrees(t1, t2);
		System.out.println("done");

	}
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1==null && t2==null){
			return null;
		}
		int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);

		TreeNode op = new TreeNode(val);

		op.left=mergeTrees(t1==null? null : t1.left, t2==null? null : t2.left);
		op.right=mergeTrees(t1==null? null : t1.right, t2==null? null : t2.right);

		return op;
		}


}
