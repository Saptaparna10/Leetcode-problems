package Leetcode;

import java.util.*;

public class SubarraySumK {

	 public int subarraySum(int[] nums, int k) {
	        int ans = 0, sum = 0;
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int num : nums) {
	            map.put(-sum, map.getOrDefault(-sum, 0) + 1);
	            sum += num;
	            ans += map.getOrDefault(k - sum, 0);
	        }
	        return ans;
	    }
	 
	public static void main(String[] args) {
		SubarraySumK sk = new SubarraySumK();
		int nums[]={1,1,1};
		System.out.println(sk.subarraySum(nums, 2));
	}

}
