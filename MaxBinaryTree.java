package Leetcode;

public class MaxBinaryTree {

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		if(nums==null){
			return null;
		}
		return construct(nums,0,nums.length-1);
	}

	private TreeNode construct(int[] nums, int start, int end) {
		 if(start>end){
			 return null;
		 }
		 int index=start;
		 for(int i=start+1;i<=end;i++){
			 if(nums[i]>nums[index]){
				 index=i;
			 }
		 }
		 TreeNode root = new TreeNode(nums[index]);
		 root.left=construct(nums, start, index-1);
		 root.right=construct(nums, index+1, end);
		 return root;
	}
}
