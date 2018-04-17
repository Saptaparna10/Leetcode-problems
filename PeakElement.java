package Leetcode;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeakElement p = new PeakElement();
		int nums[] = {1};
		System.out.println(p.findPeakElement(nums));

	}
	public int findPeakElement(int[] nums) {
		if(nums==null){
			return-1;
		}
		if(nums.length==1){
			return nums[0];
		}
		if(nums[nums.length-1]>nums[nums.length-2]){
			return nums.length-1;
		}
		if(nums.length>1 && nums[0]>nums[1]){
			return nums[0];
		}
		for(int i=1;i<nums.length-1;i++){
			if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
				return i;
			}
		}
		return -1;
	}

}
