package Leetcode;

public class SearchRange {

	public int[] searchRange(int[] nums, int target) {
		int[] res=new int[2];
		int lo=0, hi=nums.length-1;
		while(lo<=hi){
			int mid=(lo+hi)/2;
			if(nums[mid]==target){
				lo=mid;
				hi=mid;
				while(lo>0 && nums[lo-1]==nums[lo]){
					lo--;
				}
				while(hi<nums.length-1 && nums[hi+1]==nums[hi]){
					hi++;
				}
				res[0]=lo;
				res[1]=hi;
				return res;
			}
			else if(nums[mid]<target){
				lo=mid+1;
			}
			else{
				hi=mid-1;
			}
		}

		res[0]=-1;
		res[1]=-1;

		return res;
	}


	public static void main(String[] args) {

		SearchRange sr=new SearchRange();
		int[] nums={1};
		int[] res= sr.searchRange(nums, 1);
		for(int i:res){
			System.out.println(i);
		}
	}

	/*


	public int[] searchRange(int[] nums, int target) {
	    int[] result = new int[2];
	    result[0] = findFirst(nums, target);
	    result[1] = findLast(nums, target);
	    return result;
	}

	private int findFirst(int[] nums, int target){
	    int idx = -1;
	    int start = 0;
	    int end = nums.length - 1;
	    while(start <= end){
	        int mid = (start + end) / 2;
	        if(nums[mid] >= target){
	            end = mid - 1;
	        }else{
	            start = mid + 1;
	        }
	        if(nums[mid] == target) idx = mid;
	    }
	    return idx;
	}

	private int findLast(int[] nums, int target){
	    int idx = -1;
	    int start = 0;
	    int end = nums.length - 1;
	    while(start <= end){
	        int mid = (start + end) / 2;
	        if(nums[mid] <= target){
	            start = mid + 1;
	        }else{
	            end = mid - 1;
	        }
	        if(nums[mid] == target) idx = mid;
	    }
	    return idx;
	}
	 */}
