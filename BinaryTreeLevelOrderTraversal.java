package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversal {


	public static void main(String[] args) {
		TreeNode bt = new TreeNode(3);
		bt.left = new TreeNode(9);
		bt.right = new TreeNode(20);
		bt.right.left = new TreeNode(15);
		bt.right.right = new TreeNode(7);

		BinaryTreeLevelOrderTraversal bfs = new BinaryTreeLevelOrderTraversal();
		bfs.levelOrderTraversal(bt);

	}

	private List<List<Integer>>  levelOrderTraversal(TreeNode root) {
		if(root==null){
			return null;
		}
		List<List<Integer>> res = new ArrayList<>();
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();	
		q.add(root);
		while(!q.isEmpty()){
			int count = q.size();
			ArrayList<Integer> sub = new ArrayList<Integer>();
			for(int i=0;i<count;i++){
				if(q.peek().left !=null){
					q.add(q.peek().left);
				}
				if(q.peek().right !=null){
					q.add(q.peek().right);
				}
				sub.add(q.poll().val);
			}
			res.add(sub);
			
			
		}
		return res;
	}



}


