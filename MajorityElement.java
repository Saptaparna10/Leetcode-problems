package Leetcode;

public class MajorityElement {

	public static void main(String args[]){
		MajorityElement m = new MajorityElement();
		int[] nums = {5,1,5,5,7,3,3,3,1,3,3,3};
		System.out.println(m.majorityElement(nums));
	}
	
	public int majorityElement(int[] nums) {
		//Moore's voting algorithm
		int major=nums[0], count = 1;
        for(int i=1; i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else count--;
            
        }
        return major;
	}
}
