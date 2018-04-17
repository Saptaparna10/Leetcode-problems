package Leetcode;

public class MaxAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxAvg m=new MaxAvg();
		int[] nums={4,0,4,3,3};
		System.out.println(m.findMaxAverage(nums,5));
	}
	
	public double findMaxAverage(int[] nums, int k) {
        double curr=0,max=Integer.MIN_VALUE;
        int i=0,j=0,count=0;
        
        while(j<nums.length){
            count=j-i+1;
            if(count>k){
                curr=(curr*k-nums[i++]);
                curr=curr/(k-1);
                //if(curr>max) max=curr;
            } 
            else{
                curr=(curr*(count-1)+nums[j])/(count);
                if(curr>max) max=curr;
                j++;
            }
        }
        return max;
    }

}
