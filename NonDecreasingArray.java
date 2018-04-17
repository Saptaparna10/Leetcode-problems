package Leetcode;

public class NonDecreasingArray {

	public static void main(String[] args) {
		NonDecreasingArray n = new NonDecreasingArray();
		int[] arr = {3,4,2,3};
		System.out.println(n.checkPossibility(arr));
	}

	public boolean checkPossibility(int[] nums) {
		int count = 0;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]>nums[i+1]){
				if(count<1){
					count++;
					if(i>0 && nums[i+1]<nums[i-1]){
						nums[i+1]=nums[i];
					}
					else{
						nums[i]=nums[i+1];
					}
					continue;
				}
				else{
					return false;
				}
			}
		}
		return true;

	}
}
