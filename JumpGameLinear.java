package Leetcode;

public class JumpGameLinear {
	
	public boolean canJump(int[] nums) {
	    int reachable = 0;
	    for (int i=0; i<nums.length; ++i) {
	        if (i > reachable) return false;
	        reachable = Math.max(reachable, i + nums[i]);
	    }
	    return true;
	}
	public static void main(String args[]){
		JumpGameLinear j =new JumpGameLinear();
		int[] nums={3,2,1,0,4};
		System.out.println(j.canJump(nums));
	}
}
