package Leetcode;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		SearchInRotatedArray s=new SearchInRotatedArray();
		int[] nums={3,1};
		System.out.println(s.search(nums, 1));

	}
	public int search(int[] nums, int target) {
		return searchHelper(nums,0,nums.length-1,target);
	}
	private int searchHelper(int[] nums, int left, int right, int target) {
		if(left>right){
			return -1;
		}
		int mid=(left+right)/2;
		if(nums[mid]==target){
			return mid;
		}
		if(nums[left]<nums[mid]){
			if(target<nums[mid] && target>=nums[left]){
				return searchHelper(nums, left, mid-1, target);
			}
			else{
				return searchHelper(nums, mid+1, right, target);
			}
		}
		if(nums[right]>nums[mid]){
			if(target>nums[mid] && target<=nums[right]){
				return searchHelper(nums, mid+1, right, target);
			}
			else{
				return searchHelper(nums, left, mid-1, target);
			}
		}
		if(nums[left]==nums[mid]){
			if(nums[right]!=nums[mid]){
				return searchHelper(nums, mid+1, right, target);
			}
			else{
				int result = searchHelper(nums, left, mid-1, target);
				if(result==-1){
					return searchHelper(nums, mid+1, right, target);
				}
				else{
					return result;
				}
			}
		}
		return -1;
	}

}
