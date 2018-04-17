package Leetcode;

public class ProductOfArrayExceptSelf {

	//TOUGH!!!!

	public static void main(String args[]){
		ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
		int nums[] = {1,2,3,4};
		int[] res = p.productExceptSelf(nums);
		for(int i:res){
			System.out.println(i);
		}
	}

	public int[] productExceptSelf(int[] nums) {
		//O(n2) solution
		/*int[] res = new int[nums.length];
		for(int i=0;i<nums.length;i++){
			int product=1;
			int k=0;
			while(k<nums.length){
				if(i==k++){
					continue;
				}
				product=product*nums[k-1];
			}
			res[i]=product;
		}
		return res;*/
		//O(n) solution
		int[] result = new int[nums.length];
	    for (int i = 0, tmp = 1; i < nums.length; i++) {
	        result[i] = tmp;
	        tmp *= nums[i];
	    }
	    for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
	        result[i] *= tmp;
	        tmp *= nums[i];
	    }
	    return result;
	}

}
