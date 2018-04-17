package Leetcode;

public class MoveZero {

	 public void moveZeroes(int[] nums) {
	        int j=0;
	       
	        //j increses only when 0 is not encountered
	        // if zero,j stays there then swaps next digit with zero
	        for(int i=0;i<nums.length;i++){
	        	if(nums[i]!=0){
	        		int temp=nums[i];
	        		nums[i]=nums[j];
	        		nums[j]=temp;
	        		j++;
	        	}
	        }
	    }
	
	public static void main(String[] args) {
		MoveZero m = new MoveZero();
		int[] nums = {0, 1, 0, 3, 12};
		m.moveZeroes(nums);
		for(int i:nums){
			System.out.print(i+" ");
		}
	}

}
