package Leetcode;

import java.util.Stack;

public class BSTIterator {
	
private Stack<TreeNode> stack = new Stack<TreeNode>();

	public static void main(String args[]){
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(4);
		root.left.left=new TreeNode(3);
		BSTIterator i =new BSTIterator(root);
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
    
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmpNode = stack.pop();
        pushAll(tmpNode.right);
        return tmpNode.val;
    }
    
    private void pushAll(TreeNode node) {
        for (; node != null; stack.push(node), node = node.left);
    }
}
