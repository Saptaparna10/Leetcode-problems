package Leetcode;

public class HouseRobber {

	public static void main(String[] args) {
		HouseRobber h =new HouseRobber();
		int[] input = {};
		System.out.println(h.findMaxProfit(input));

	}

	private int findMaxProfit(int[] input) {
		 if(input.length==0){
	            return 0;
	        }
		int dp[]=new int[input.length];
		dp[0]=input[0];
		dp[1]=input[0]>input[1]?input[0]:input[1];
		for(int i=2;i<input.length;i++){
			dp[i]= Math.max(input[i]+dp[i-2], dp[i-1]);
		}
		return dp[input.length-1];
	}

}
